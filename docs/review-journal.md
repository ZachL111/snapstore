# Review Journal

The repository goal stays the same: simulate snapshotting key-value storage with WAL replay and compaction. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its storage focus without claiming live deployment or external usage.

## Cases

- `baseline`: `WAL pressure`, score 140, lane `ship`
- `stress`: `snapshot width`, score 130, lane `watch`
- `edge`: `compaction risk`, score 152, lane `ship`
- `recovery`: `read drift`, score 174, lane `ship`
- `stale`: `WAL pressure`, score 190, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
