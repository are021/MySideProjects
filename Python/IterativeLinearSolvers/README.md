# Testing the Efficiencies of Krylov Subspace iterative methods GMRES and GMRES with Restart

In my Linear Algebra course, we learned to solve linear systems using traditional direct methods, such as the Gauss-Jordan elimination method. Standard matrix factorization algorithms tend to have an expected runtime of O(n2) or worse, which can often lead to very inefficient algorithms when dealing with larger or more difficult matrices. Iterative linear solvers make solving these matrices more efficient, by getting closer and closer to the actual solution the longer the algorithm operates. This allows the methods to use less memory than direct methods like the Gauss-Jordan Method. Krylov Subspace methods are algorithms used to solve Ax = b linear algebra problems, by searching for the approximate solution from the Krylov subspace. Generalized Minimal Residual and Generalized Minimal Residual with Restart are two Krylov subspace iterative methods than can be used to solve these incredibly large linear systems.

The main research question for this project is to ask, “How can the runtime of Generalized Minimal Residual algorithms be improved with a restart parameter?” For this project, I would like to compare the GMRES algorithm, and GMRES with restart algorithm, by comparing the runtime of these algorithms for very large linear systems. I will be testing the GMRES with restart algorithm by varying the restart parameters to find an ideal restart parameter. I will be generating large matrices using the Python Random library and applying these to our iterative methods. If time permits, I would also like to compare these Krylov Subspace methods runtime to other iterative methods found in the Python “scipy” library,


Additional Sources: <br>
• http://www.cs.yale.edu/homes/spielman/561/2009/lect15-09.pdf <br>
• https://acme.byu.edu/00000179-aa18-d402-af7f-abf806ac0001/gmres2020-pdf <br>
• https://www.sciencedirect.com/science/article/pii/S0377042709000132 <br>
