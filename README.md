# uniquesanddups
:   Read in a list of words/letters and determine which values are unique and which values are duplicates.  Uniques are values that occur in the original list at least once.  Duplicates are values that occur in the original list more than once.


# Sample Data
a b c d e f g h a b c d e f g h i j k

one two three one two three six seven one two

1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6

# Sample Output

Original List : a b c d e f g h a b c d e f g h i j k
Uniques : [a, b, c, d, e, f, g, h, i, j, k]
Dupes : [a, b, c, d, e, f, g, h]


Original List : one two three one two three six seven one two
Uniques : [one, seven, six, three, two]
Dupes : [one, three, two]


Original List : 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6
Uniques : [1, 2, 3, 4, 5, 6]
Dupes : [1, 2, 3, 4, 5]
