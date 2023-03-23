#include <stdio.h>
#include <stdlib.h>

char* reverseString(char* name);
int main(){
    char val[50];
    printf("Enter a string (Max Length): ");
    scanf("%s", val);
    char* reversed = reverseString(val);
    printf("Your name is %s.\n\n", reversed);
    free(reversed);
    return 0;
}


char* reverseString(char* name){
    char* reversed = (char*)calloc(strlen(name)+1,sizeof(char));
    int j = 0;
    for (int i = strlen(name)-1; i >= 0; i--){
        reversed[j] = name[i];
        j++;
    }
    return reversed;
}