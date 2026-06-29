import random
import matplotlib.pyplot as plt
import numpy as np
from prettytable import PrettyTable


""" Aqui está uma diretriz geral de como um algoritmo genético procede:

        Etapa 1: Inicialização \\ Primeiro, geramos uma população inicial de indivíduos aleatórios. 
                                  Essa etapa cria um conjunto diversificado de possíveis soluções para iniciar o algoritmo. 

        Etapa 2: Avaliação \\ Em seguida, precisamos calcular a aptidão de cada indivíduo na população. Aqui, usamos a 
                              função de adequação para avaliar a qualidade de cada solução.

        Etapa 3: Seleção \\ Usando os critérios de seleção, selecionamos indivíduos para reprodução com base em sua aptidão. 
                            Essa etapa determina quais indivíduos serão os pais.

        Etapa 4: Crossover \\ O crossover vem em seguida. Ao combinar o material genético dos pais selecionados, aplicamos 
                              técnicas de cruzamento para gerar novas soluções ou descendentes.

        Etapa 5: Mutação \\ Para manter a diversidade em nossa população, precisamos introduzir mutações aleatórias na prole.

        Etapa 6: Substituição \\ Em seguida, substituímos parte ou toda a população antiga pela nova prole, determinando quais 
                                 indivíduos passam para a próxima geração.

        Etapa 7: Repetir \\ As etapas anteriores 2-6 são repetidas em loop por um número definido de gerações ou até que uma 
                            condição de término seja atendida. Esse loop permite que a população evolua ao longo do tempo e, 
                            com sorte, resulte em uma boa solução.
"""


# Define the fitness function (objective is to create the flattest U-shape)
def fitness_function(params):
    a, b, c = params
    if a <= 0:
        return -float('inf')  # Penalize downward facing u-shapes heavily
    vertex_x = -b / (2 * a) #x value at vertex
    vertex_y = a * (vertex_x ** 2) + b * vertex_x + c #y value at vertex
    y_left = a * (-1) ** 2 + b * (-1) + c #y-coordinate at x = -1
    y_right = a * (1) ** 2 + b * (1) + c #y-coordinate at x = 1
    curviness = abs(y_left - vertex_y) + abs(y_right - vertex_y)
    return -curviness  # Negate to minimize curviness

# Create the initial population
def create_initial_population(size, lower_bound, upper_bound):
    population = []
    for _ in range(size):
        individual = (random.uniform(lower_bound, upper_bound),
                      random.uniform(lower_bound, upper_bound),
                      random.uniform(lower_bound, upper_bound))
        population.append(individual)
    return population

# Selection function using tournament selection
def selection(population, fitnesses, tournament_size=3):
    selected = []
    for _ in range(len(population)):
        tournament = random.sample(list(zip(population, fitnesses)), tournament_size)
        winner = max(tournament, key=lambda x: x[1])[0]
        selected.append(winner)
    return selected

# Crossover function
def crossover(parent1, parent2):
    alpha = random.random()
    child1 = tuple(alpha * p1 + (1 - alpha) * p2 for p1, p2 in zip(parent1, parent2))
    child2 = tuple(alpha * p2 + (1 - alpha) * p1 for p1, p2 in zip(parent1, parent2))
    return child1, child2

# Mutation function
def mutation(individual, mutation_rate, lower_bound, upper_bound):
    individual = list(individual)
    for i in range(len(individual)):
        if random.random() < mutation_rate:
            mutation_amount = random.uniform(-1, 1)
            individual[i] += mutation_amount
            # Ensure the individual stays within bounds
            individual[i] = max(min(individual[i], upper_bound), lower_bound)
    return tuple(individual)

# Main genetic algorithm function
def genetic_algorithm(population_size, lower_bound, upper_bound, generations, mutation_rate):
    population = create_initial_population(population_size, lower_bound, upper_bound)
    
    # Prepare for plotting
    fig, axs = plt.subplots(3, 1, figsize=(12, 18))  # 3 rows, 1 column for subplots
    best_performers = []
    all_populations = []

    # Prepare for table
    table = PrettyTable()
    table.field_names = ["Generation", "a", "b", "c", "Fitness"]

    for generation in range(generations):
        fitnesses = [fitness_function(ind) for ind in population]

        # Store the best performer of the current generation
        best_individual = max(population, key=fitness_function)
        best_fitness = fitness_function(best_individual)
        best_performers.append((best_individual, best_fitness))
        all_populations.append(population[:])
        table.add_row([generation + 1, best_individual[0], best_individual[1], best_individual[2], best_fitness])

        population = selection(population, fitnesses)

        next_population = []
        for i in range(0, len(population), 2):
            parent1 = population[i]
            parent2 = population[i + 1]

            child1, child2 = crossover(parent1, parent2)

            next_population.append(mutation(child1, mutation_rate, lower_bound, upper_bound))
            next_population.append(mutation(child2, mutation_rate, lower_bound, upper_bound))

        # Replace the old population with the new one, preserving the best individual
        next_population[0] = best_individual
        population = next_population

    # Print the table
    print(table)

    # Plot the population of one generation (last generation)
    final_population = all_populations[-1]
    final_fitnesses = [fitness_function(ind) for ind in final_population]

    axs[0].scatter(range(len(final_population)), [ind[0] for ind in final_population], color='blue', label='a')
    axs[0].scatter([final_population.index(best_individual)], [best_individual[0]], color='cyan', s=100, label='Best Individual a')
    axs[0].set_ylabel('a', color='blue')
    axs[0].legend(loc='upper left')
    
    axs[1].scatter(range(len(final_population)), [ind[1] for ind in final_population], color='green', label='b')
    axs[1].scatter([final_population.index(best_individual)], [best_individual[1]], color='magenta', s=100, label='Best Individual b')
    axs[1].set_ylabel('b', color='green')
    axs[1].legend(loc='upper left')
    
    axs[2].scatter(range(len(final_population)), [ind[2] for ind in final_population], color='red', label='c')
    axs[2].scatter([final_population.index(best_individual)], [best_individual[2]], color='yellow', s=100, label='Best Individual c')
    axs[2].set_ylabel('c', color='red')
    axs[2].set_xlabel('Individual Index')
    axs[2].legend(loc='upper left')
    
    axs[0].set_title(f'Final Generation ({generations}) Population Solutions')

    # Plot the values of a, b, and c over generations
    generations_list = range(1, len(best_performers) + 1)
    a_values = [ind[0][0] for ind in best_performers]
    b_values = [ind[0][1] for ind in best_performers]
    c_values = [ind[0][2] for ind in best_performers]
    fig, ax = plt.subplots()
    ax.plot(generations_list, a_values, label='a', color='blue')
    ax.plot(generations_list, b_values, label='b', color='green')
    ax.plot(generations_list, c_values, label='c', color='red')
    ax.set_xlabel('Generation')
    ax.set_ylabel('Parameter Values')
    ax.set_title('Parameter Values Over Generations')
    ax.legend()

    # Plot the fitness values over generations
    best_fitness_values = [fit[1] for fit in best_performers]
    min_fitness_values = [min([fitness_function(ind) for ind in population]) for population in all_populations]
    max_fitness_values = [max([fitness_function(ind) for ind in population]) for population in all_populations]
    fig, ax = plt.subplots()
    ax.plot(generations_list, best_fitness_values, label='Best Fitness', color='black')
    ax.fill_between(generations_list, min_fitness_values, max_fitness_values, color='gray', alpha=0.5, label='Fitness Range')
    ax.set_xlabel('Generation')
    ax.set_ylabel('Fitness')
    ax.set_title('Fitness Over Generations')
    ax.legend()

    # Plot the quadratic function for each generation
    fig, ax = plt.subplots()
    colors = plt.cm.viridis(np.linspace(0, 1, generations))
    for i, (best_ind, best_fit) in enumerate(best_performers):
        color = colors[i]
        a, b, c = best_ind
        x_range = np.linspace(lower_bound, upper_bound, 400)
        y_values = a * (x_range ** 2) + b * x_range + c
        ax.plot(x_range, y_values, color=color)

    ax.set_xlabel('x')
    ax.set_ylabel('y')
    ax.set_title('Quadratic Function')

    # Create a subplot for the colorbar
    cax = fig.add_axes([0.92, 0.2, 0.02, 0.6])  # [left, bottom, width, height]
    norm = plt.cm.colors.Normalize(vmin=0, vmax=generations)
    sm = plt.cm.ScalarMappable(cmap='viridis', norm=norm)
    sm.set_array([])
    fig.colorbar(sm, ax=ax, cax=cax, orientation='vertical', label='Generation')

    plt.show()

    return max(population, key=fitness_function)

# Parameters for the genetic algorithm
population_size = 100
lower_bound = -50
upper_bound = 50
generations = 20
mutation_rate = 1

# Run the genetic algorithm
best_solution = genetic_algorithm(population_size, lower_bound, upper_bound, generations, mutation_rate)
print(f"Best solution found: a = {best_solution[0]}, b = {best_solution[1]}, c = {best_solution[2]}")


""" O desempenho de um algoritmo genético depende de vários parâmetros \\ Tamanho da População
                                                                       \\ Taxa do Cruzamento
                                                                       \\ Taxa da Mutação
                                                                       \\ Parâmetros de Limite

        Populações Maiores ajudam a encontrar a solução ideal mais rapidamente, pois há mais opções. No
        entanto, exigem mais recursos e tempo para serem executadas.

        Taxas de cruzamento mais altas podem levar a uma convergência mais rápida, combinando caracteristicas 
        benéficas de diferentes indivíduos com mais frequência. Entretanto, pode perturbar a estrutura da 
        população, levando à convergência prematura.

        Taxas de Mutação mais altas ajudam a manter a diversidade genética, evitando que o algoritmo fique preso 
        em um ótimo local. No entanto, se a taxa de mutação for muito alta, ela poderá interromper o processo de 
        convergência ao introduzir muita aleatoriedade, dificultando o refinamento das soluções pelo algoritmo.

        Os parâmetros de limite definem o intervalo dentro do qual o algoritmo busca soluções. Uma área delimitadora 
        muito estreita pode deixar de oferecer soluções ideais para o seu problema. Uma área delimitadora muito ampla 
        exigirá mais tempo e recursos para ser executada. Mas há outras considerações também. 

        ELITISMO ||
            Por outro lado, o cruzamento e a mutação fortes ou qualquer aleatoriedade na seleção podem fazer com que 
            as soluções excelentes acabem não se reproduzindo. É aí que entra o elitismo. O elitismo é uma técnica 
            em que os melhores indivíduos são transferidos diretamente para a próxima geração para preservar boas 
            soluções. Isso ajuda a garantir que as melhores soluções não sejam perdidas durante o processo evolutivo.

            No entanto, seja cauteloso se você usar o elitismo. Se o elitismo for usado sem uma diversidade populacional 
            alta o suficiente, você pode acabar tendo uma convergência prematura. Se o seu problema de negócios exigir 
            técnicas de elitismo, certifique-se de combiná-las com funções de cruzamento e mutação suficientemente fortes 
            e um grande tamanho de população. Essa abordagem ajuda a manter um equilíbrio saudável entre a exploração de 
            soluções conhecidas e a exploração de novas possibilidades.

"""