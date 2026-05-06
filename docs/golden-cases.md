# Golden Cases

The golden files are not a benchmark. They are a stable review surface for storage.

The main golden fixture is `fixtures/golden/scoreboard.csv`. The matrix fixture is `fixtures/golden/lane-matrix.csv`. Together they cover `WAL pressure`, `snapshot width`, `compaction risk`, and `read drift` with different score ranges.

The purpose is to make intentional rule changes show up in review.
