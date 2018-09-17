// You are given two non-empty linked lists representing two non-negative integers. The digits
// are stored in reverse order and each of their nodes contain a single digit. Add the two
// numbers and return it as a linked list. You may assume the two numbers do not contain any
// leading zero, except the number 0 itself.
//
// 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
// 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
//
// Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.

#define NULL 0

struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
	ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) 
	{
		ListNode* l3 = new ListNode(l1->val + l2->val);
		ListNode* l = l3;
		int flag = 0;
		while (l1 != NULL || l2 != NULL) 
		{
			flag = 0;
			if (l->val >= 10) 
			{
				flag = 1;
				l->val %= 10;
			}
			if (l1 != NULL)
				l1 = l1->next;
			if (l2 != NULL)
				l2 = l2->next;
			if (l1 != NULL && l2 != NULL) 
			{
				l->next = new ListNode(l1->val + l2->val + flag);
			}
			else if (l1 == NULL && l2 != NULL) 
			{
				l->next = new ListNode(l2->val + flag);
			}
			else if (l2 == NULL && l1 != NULL) 
			{
				l->next = new ListNode(l1->val + flag);
			}
			if (l->next != NULL)
				l = l->next;
		}
		if (flag == 1)
			l->next = new ListNode(1);
		return l3;
	}

};