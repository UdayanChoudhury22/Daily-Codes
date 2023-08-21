# Java Collection | Set 5 (LinkedHash Set)
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:20px">Implement different operations on a LinkedHashset&nbsp;s&nbsp;.<br>
<br>
<strong>Input:</strong><br>
The first line of input contains an integer <strong>T</strong> denoting the no of test cases . Then T test cases follow. The first line of input contains an integer <strong>Q</strong> denoting the no of queries . Then in the next line are <strong>Q</strong>&nbsp;space separated queries .<br>
A query can be of&nbsp;four&nbsp;types&nbsp;<br>
1. a x (inserts an element x to the LinkedHashSet s)</span><br>
<span style="font-size:20px">2. b (prints the contents of the LinkedHashSet s in increasing order)<br>
3. c x&nbsp;(erases an element x from the LinkedHashSet s)<br>
4. d x (prints 1 if the element x is present in the LinkedHashSet&nbsp;else print -1)<br>
5. e (prints the size of the LinkedHashSet s)</span><br>
<span style="font-size:20px">6. f (prints the contents of the LinkedHashSet s in insertion order)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><br>
<span style="font-size:20px"><strong>Output:</strong><br>
The output for each test case will&nbsp;&nbsp;be space separated integers denoting the results of each query . </span></p>

<p><span style="font-size:20px"><strong>Constraints:</strong><br>
1&lt;=T&lt;=100<br>
1&lt;=Q&lt;=100<br>
<br>
<strong>Example:</strong></span></p>

<p><span style="font-size:20px"><strong>Input</strong><br>
2<br>
7<br>
a 1 a 2 a 3 b c 2 b f<br>
10 </span><br>
<span style="font-size:20px">a 5 a 4 a 3 a 2 a 1 b c 1 c 3 b f<br>
<strong>&nbsp;<br>
Output</strong></span></p>

<p><span style="font-size:20px">1 2 3 1 3 1 3<br>
1 2 3 4 5 2 4 5 5 4 2 </span></p>

<p><br>
<span style="font-size:20px"><strong>Explanation :<br>
For the first test case</strong><br>
There are seven queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order<br>
1. a 1 &nbsp; &nbsp; { insert 1 to LinkedHashSet now set has {1}&nbsp;}<br>
2. a 2 &nbsp; &nbsp; {inserts 2&nbsp;to LinkedHashSet now set has {1,2}&nbsp;}<br>
3. a 3 &nbsp; &nbsp; {inserts 3 to set now LinkedHashSet has {1,2,3}&nbsp;}<br>
4. b &nbsp; &nbsp; &nbsp; &nbsp;{prints the LinkedHashSet contents ie 1,2,3}<br>
5. c 2 &nbsp; &nbsp; {removes 2 from the LinkedHashSet&nbsp;}<br>
6. b &nbsp; &nbsp; &nbsp; &nbsp;{prints the LinkedHashSet contents ie1,3} &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><br>
<span style="font-size:20px">7. f&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; {prints the LinkedHashSet contents in inserted order ie&nbsp; 1,3}&nbsp; </span></p>

<p><span style="font-size:20px"><strong>For the second test case&nbsp;</strong></span></p>

<p><span style="font-size:20px">There are ten queries.&nbsp;Queries&nbsp;are&nbsp;performed in this order<br>
1. a 5&nbsp; &nbsp;&nbsp; {inserts 5 to set now set has {5}&nbsp;} </span></p>

<p><span style="font-size:20px">2. a 4 &nbsp;&nbsp;&nbsp; {inserts 4 to set now set has {5,4}&nbsp;}&nbsp;&nbsp;</span></p>

<p><span style="font-size:20px">3. a 3 &nbsp;&nbsp;&nbsp; {inserts 3 to set now set has {5,4,3}&nbsp;}&nbsp; </span></p>

<p><span style="font-size:20px">4. a 2 &nbsp;&nbsp;&nbsp; {inserts 2 to set now set has {5,4,3,2}&nbsp;}&nbsp; </span></p>

<p><span style="font-size:20px">5. a 1 &nbsp;&nbsp;&nbsp; {inserts 1 to set now set has {5,4,3,2,1}&nbsp;}&nbsp; </span></p>

<p><span style="font-size:20px">6. b &nbsp; &nbsp; &nbsp; &nbsp;{prints the LinkedHashSet contents in increasing order ie 1,2,3,4,5}&nbsp; </span></p>

<p><span style="font-size:20px">7. c 1 &nbsp; &nbsp; {removes 1 from the LinkedHashSet&nbsp;}&nbsp; </span></p>

<p><span style="font-size:20px">8. c 3 &nbsp; &nbsp; {removes 3 from the LinkedHashSet&nbsp;}&nbsp; </span></p>

<p><span style="font-size:20px">9. b&nbsp; &nbsp; &nbsp; &nbsp; {prints the LinkedHashSet contents in increasing order ie 2,4,5}&nbsp; </span></p>

<p><span style="font-size:20px">10. f&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; {prints the LinkedHashSet contents in inserted order ie 5,4,2} </span><br>
<br>
<br>
<span style="font-size:14px"><strong>Note:</strong>The <strong>Input/Output</strong> format and <strong>Example</strong> given are used for system's internal purpose, and should be used by a user for <strong>Expected Output</strong> only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.</span></p>

<p>&nbsp;</p>
</div>