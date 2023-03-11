
#include "stack.h"

/**
 * Initialize a linked list to empty
 * @param list Pointer to the linked list struct
 */
void initialize_list(Stack *list)
{
    list->head = NULL;
    list->tail = NULL;
}


/**
 * Append a name onto the end of the list.
 * @param list Pointer to the linked list struct
 * @param name Name to add to the list
 */
void append_list(Stack *list, const char *name)
{
    // Allocate a linked list node
    Node *node = (Node *)calloc(1, sizeof(Node));
    node->next = NULL;
    node->prev = NULL; 
    // Copy the name into the list
    node->name = (char *)calloc(strlen(name) + 1, sizeof(char));
    strncpy(node->name, name, strlen(name));

    if (list->tail == NULL)
    {
        // List is empty, make this the head
        // and tail of the list
        list->head = node;
        list->tail = node;
    }
    else
    {
        // Link onto the tail of the list
        list->tail->next = node;
        node->prev = list->tail;
        list->tail = node;
    
    }
}


/**
 * Free the memory allocated for our list
 * @param list Pointer to linked list object
 */
void free_list(Stack *list)
{
    Node *node;

    for (node = list->head; node != NULL;  )
    {
        Node *next = node->next;

        free(node->name);
        free(node);

        node = next;
    }

    list->head = NULL;
    list->tail = NULL;
}


