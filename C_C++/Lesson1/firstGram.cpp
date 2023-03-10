#include <iostream>


int main()
{
    
    std::cout << "Enter an integer: ";

    int x{};
    std::cin >> x;
    
    std::cout << "Double that number is: " << 2 * x << '\n';
    std::cout << "Triple that number is: " << 3 * x << '\n';


    return 0;

}