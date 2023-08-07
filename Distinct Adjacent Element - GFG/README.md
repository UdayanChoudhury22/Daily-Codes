# Distinct Adjacent Element
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array arr[] of size N, the task is to check whether it is possible to obtain an array having distinct neighboring elements by swapping two neighboring array elements.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 3, arr[] = {1, 1, 2}
<strong>Output:</strong>  YES
<strong>Explanation</strong>: Swap 1 (second last element) 
and 2 (last element), to obtain 1 2 1,
which has distinct neighbouring elements.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 4, arr[] = {7, 7, 7, 7}
<strong>Output:</strong> NO
<strong>Explanation: </strong>We can't swap to obtain 
distinct elements in neighbor .</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything.&nbsp;You just need to complete the function <strong>distinctAdjacentElement</strong>() that takes array<strong> arr[]&nbsp;</strong>&nbsp;and its size<strong>&nbsp;N</strong>&nbsp;as input parameters and returns a boolean value denoting if distinct neighbours are possible or not.&nbsp;<br>
Note: The generated output is YES or NO according to the returned value.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N).<br>
<strong>Expected Auxiliary Space:</strong> O(N).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
2 ≤ N ≤ 10<sup>6</sup></span></p>

<p>&nbsp;</p>
</div>