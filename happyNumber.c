#include <stdio.h>

int getNext(int n) {
    int sum = 0;
    while (n > 0) {
        int digit = n % 10;
        sum += digit * digit;
        n /= 10;
    }
    return sum;
}

int isHappy(int n) {
    int slow = n;
    int fast = getNext(n);

    while (fast != 1 && slow != fast) {
        slow = getNext(slow);
        fast = getNext(getNext(fast)); // move fast pointer twice
    }

    return fast == 1;
}

int main() {
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (isHappy(n)) {
        printf("%d is a Happy Number.\n", n);
    } else {
        printf("%d is NOT a Happy Number.\n", n);
    }

    return 0;
}
