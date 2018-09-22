//
// Created by zly on 9/22/2018.
//

#ifndef C_LISTNODE_H
#define C_LISTNODE_H

#include <cstddef>

class ListNode {
public:
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {};
};


#endif //C_LISTNODE_H
