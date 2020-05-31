# quickSort
java quicksort
<h3>The quick sort runs in O(n lgn) time in the best case.</h3>
<p>The best case is when the sequence values are uniformly randomly distributed so that each call 
to the quick partition algorithm will result in balanced split of the sequence. In that case, each
recursive call to the quick sort algorithm divides the sequence into two subsequences of nearly
equal length. As with the binary search and the merge sort, this repeated subdivision takes lgn steps 
to get down to size 1 subsequences. So there are O(lgn) calls made to the quick partition
algorithm which runs in O(n) time, so the total running time for the quick sort algorithm is
O(n lgn).</p>
<h3>The quick sort runs in O(n^2) time in the worst case</h3>
<p>The worst case is when the sequence is already sorted (or sorted in reverse order). In that case,
the quick partition algorithm will always select the last element (or the first element, if the
sequence is sorted in reverse order), resulting in the most unbalanced split possible: One piece
has n 2 elements, and the other piece has 1 element. Repeated division of this type will occur
O(n) times before both pieces get down to size 1. So there are O(n) calls made to the quick partition
algorithm which runs in O(n) time, so the total running time for the quick sort algorithm is
O(n^2).</p>
