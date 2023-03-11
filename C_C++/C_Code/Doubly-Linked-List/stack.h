#pragma once 

#include <stdlib.h>  
#include <stdio.h>
#include <string.h>




/**
  * Linked List Nodes
  */

typedef struct Node
{
    char *name;

    struct Node *next; //Next Pointer
    
    struct Node *prev; //Prev Pointer
} Node;

/**
  * Reverse Stack, Items are pushed to bottom.
 */
typedef struct
{
    Node *head;
    Node *tail;

} Stack;

// Forward References

void initialize_list(Stack *list);
void append_list(Stack *list, const char *name);
void free_list(Stack *list);

