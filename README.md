# snapstore

`snapstore` is a compact Java repository for storage, centered on this goal: Simulate snapshotting key-value storage with WAL replay and compaction.

## Why This Exists

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Snapstore Review Notes

For a quick review, compare `WAL pressure` with `snapshot width` before reading the middle cases.

## Capabilities

- `fixtures/domain_review.csv` adds cases for WAL pressure and snapshot width.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/snapstore-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `WAL pressure` and `snapshot width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Shape

The fixture data drives the tests. The code stays thin, while `metadata/domain-review.json` and `config/review-profile.json` explain what each case is meant to protect.

The Java implementation avoids hidden state so fixture changes are easy to reason about.

## Local Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Verification

The verifier is intentionally local. It should fail if the fixture score math, lane assignment, or language-specific test drifts.

## Roadmap

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
