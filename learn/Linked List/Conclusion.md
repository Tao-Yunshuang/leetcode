Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

Algorithm:
1. First, we set up a false "prehead" node that allows us to easily return the head of the merged list later. We also maintain a prev pointer, which points to the current node for which we are considering adjusting its next pointer.
2. Then, we do the following until at least one of l1 and l2 points to null: if the value at l1 is less than or equal to the value at l2, then we connect l1 to the previous node and increment l1. Otherwise, we do the same, but for l2.
3. Then, regardless of which list we connected, we increment prev to keep it one step behind one of our list heads.
4. After the loop terminates, at most one of l1 and l2 is non-null. Therefore (because the input lists were in sorted order), if either list is non-null, it contains only elements greater than all of the previously-merged elements. This means that we can simply connect the non-null list to the merged list and return it.

