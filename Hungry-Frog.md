# Hungry Frog

Resolve Knight Tour like problems using Warnsdorff euristic.

## Solution

```
   1  75  68   2 100  81  23  99  82  22
  66  18  15  77  19  14  92  20  13  91
  69   3  60  74  71  61  97  72  24  98
  16  76  67  17  93  80  28  94  83  21
  65  45  70  78  63  73  89  62  12  90
  38   4  59  43  29  50  96  30  25  95
  47  35  64  46  88  79  27  87  84   8
  56  44  39  55  58  42  54  51  11  31
  37   5  48  36   6  49  85   7  26  86
  40  34  57  41  33  52  10  32  53   9
```

## Code
```java
@Override
public Board resolve(final Point start, final int boardWidth, final int boardHeight, final List<Delta> moves) {
	
	assert (boardWidth > 0);
	assert (boardHeight > 0);
	assert (start.isInside(0, 0, boardWidth, boardHeight));
	assert (moves != null && moves.size() >= 0);
		
	Board board = new Board(boardWidth, boardHeight);
	Point point = new Point(start);
		
	int index = 1;		
	while (point != null) {

		board.setCell(point, index++);
			
		LOGGER.info(String.format("Iteration #%d", index));
		LOGGER.info(String.format("Moving to %s", point));
			
		final Point v = point;
		List<Point> targets = moves.stream()	
			.map(m -> v.moveBy(m))
			.filter(t -> board.contains(t) && board.isEmpty(t))
			.collect(Collectors.toList());
			
		LOGGER.info(String.format("targets from %s --> %s", point, targets));
			
		point = targets.stream()
			.min(Comparator.comparing(i -> i.getDegree(board, moves)))
			.orElse(null);
	}
	
	LOGGER.info(String.format("FINISHED:\n%s", board));
		
	return board;
}
```
