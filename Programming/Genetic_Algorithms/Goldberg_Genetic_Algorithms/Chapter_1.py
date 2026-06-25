""" Genetic algorithms are SEARCH algorithms based on the mechanicc of natural selection and natural genetics.
        If artificial systems can be robuust, costly redesigns can be reduced or eliminated. If higher levels 
        of adaptation can be achieved, existing systems can perform their functions longer and better.

        Features for self-repair, self-guidance, and reproduction are the rule in biological systems, whereas
        theu barely exist in the most sophiticated artifical systems.
    
    Three main types of search methods:
        1 | Calculus-based

            1.1| Indirect
                 It seeks local extrema by solving the usually nonlinear set of equations resulting from 
                 setting the gradient of the objective function igual to zero.

                 It's the generalization of the elementary calculus notion of extramal points.
            1.2| Direct
                 It seeks local optima by hopping on the function and moving in a direction releted to the 
                 local gradient. This is simply the notion of bill-climbing: to find the best, climb the 
                 function in the steepest permissible direction.
        | Both lack robustness.
            | Both methods are local in scope: the optima they seek are the best in a neighborhood of the 
              current point.
            | Calculus-based methods depend upon the existence of derivaties.


        2 | Enumerative
            Lack of efficiency. Many practical spaces are simply too large to search one at a time and 
            still have a chance of using the information to some practical end.

            
        3 | Random
            Ramdom searches, in the long run, can be expected to do no better the enumerative schemes.
    """

""" HOW ARE GENETIC ALGORITHMS DIFFERENT FROM TRADICIONAL METHODS?
        Genetic algorithms are different from more normal optimazation and search procedures in four ways.
        1| GAs work with a coding parameter set, not the parameter themselves.
        2| GAs search from a population of points, not a single point.
        3| GAs use payoff (objective function) information, not derivatives or other auxiliary knowledge.
        4| GAs use probabilist transition rules, nor deterministc rules.

    Genetic algorithms require the natural parameter set of optimization problem to be coded as a finite-lenght 
    string over some finite alphabet.
    GAs use probabilistc rules to guide their search. They use random choice as a tool to guide a search toward 
    regions of the search space with likely improvement.

    The mechanics of a simple genetic algorithm | nothing more complex than copying strings and swapping partial
                                                  strings.
        Operators |  Reproduction
                     Crossover
                     Mutation

        Reproduction | Reproduction is the process in which individual strings are copied according to their 
                       objective function values, f (biologists call this function the fitness). Intuitively, 
                       we can think of the function f as some measure of profit, utility or goodnesss that we 
                       want to maximize. This operator is an artificial version of natural selection.
        Crossover | Members of the newly reproduced strings in the mating pool are mated at random. Then each 
                    pair od strings undergoes crossing over as follows:
                    A1 = 0 1 1 0 | 1
                    A2 = 1 1 0 0 | 0
                Then:
                    A'1 = 0 1 1 0 0
                    A'2 = 1 1 0 0 1
        Mutation | Mutation is needes because, even though reproduction and crossover effectively search and 
                   recombine extant notions, occasionally they may become overzealous and lose some potentially 
                   useful genetic material.
                   In artificial genetic systems, the mutation operator protects against such an irrecoverable 
                   loss. It is a insurance policy against premature loss of important notions.
    
    IMPORTANT SIMILARITIES: 
        Exploring these simalarities in more depth, we notice that certain string patterns seem highly associated 
        with good performance.

        SCHEMATA: in what ways is a string a representative of other string classes with similarities at certain
                  string positions? The framework of schemata provides the tool to answer this.
                  A schema is a similarity template describing a subset of strings with similarities at certain 
                  string positions.

    Terminology || Chromosome = String.
                || Gene = Features, Character or Detectors.
                || Allele = Feature Value.
                || Locus = String Postion.
                || Genotype = Structure.
                || Phenotype = Parameter set, Alternative solution, a Decoted structure.
                || Epistasis = Nonlinearity.          
    """
