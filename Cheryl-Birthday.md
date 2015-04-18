# Cheryl Birthday

## Problem

Albert and Bernard have just met Cheryl. *“When is your birthday?”* Albert asked Cheryl. Cheryl thought for a moment and said, *“I won’t tell you, but I’ll give you some clues”*. She wrote down a list of ten dates:

* May 15, May 16, May 19
* June 17, June 18
* July 14, July 16
* August 14, August 15, August 17

*“One of these is my birthday”* she said.

Cheryl whispered in Albert’s ear the month, and only the month, of her birthday. To Bernard, she whispered the day, and only the day. *“Can you figure it out now?”* she asked Albert.

**Albert**: *“I don’t know when your birthday is, but I know Bernard doesn’t know, either.”*

**Bernard**: *“I didn’t know originally, but now I do.”*

**Albert**: *“Well, now I know, too!”*

When is Cheryl’s birthday?

## Solution

### From first sentence

Albert says:

*"I don’t know when your birthday is, ..."*

There no single month dates, so no more information provided

*"... but I know Bernard doesn’t know, either.”*

This excludes dates of May and Jun, otherwise Bernard may know the solution. This may be possible because May 19 and Jun 18 are dates with unique day values

* <s>May 15</s>, <s>May 16</s>, <s>May 19</s>
* <s>June 17</s>, <s>June 18</s>
* July 14, July 16
* August 14, August 15, August 17

### From second sentece

*“I didn’t know originally, but now I do.”*

This excluses dates with 14t as day value, otherwise is not true that Bernard knows the solution.

* <s>May 15</s>, <s>May 16</s>, <s>May 19</s>
* <s>June 17</s>, <s>June 18</s>
* <s>July 14</s>, July 16
* <s>August 14</s>, August 15, August 17

### From last sentence

*“Well, now I know, too!”*

This ecludes dates of Aug, othewise Albert is not true that Albert knows the solution.

* <s>May 15</s>, <s>May 16</s>, <s>May 19</s>
* <s>June 17</s>, <s>June 18</s>
* <s>July 14</s>, July 16
* <s>August 14</s>, <s>August 15</s>, <s>August 17</s>

So the solution is Jul 16.
## References

See also:
* https://github.com/fj/cheryls-birthday-prolog
* https://github.com/perng/prolog_collection/blob/master/cheryls_birthday.pl
* http://www.nytimes.com/2015/04/15/science/answer-to-the-singapore-math-problem-cheryl-birthday.html?_r=0
