#include <stdio.h>

int addDigits(int num) {
    if (num == 0)
        return 0;
    return (num % 9 == 0) ? 9 : (num % 9);
}

int main() {
    int num = 38;
    printf("Result: %d\n", addDigits(num));  

    num = 0;
    printf("Result: %d\n", addDigits(num)); 

    return 0;
}
