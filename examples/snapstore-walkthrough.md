# Snapstore Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | WAL pressure | 140 | ship |
| stress | snapshot width | 130 | watch |
| edge | compaction risk | 152 | ship |
| recovery | read drift | 174 | ship |
| stale | WAL pressure | 190 | ship |

Start with `stale` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `WAL pressure` against `snapshot width`, not the raw score alone.
