# Git Dojo — my recovery notes

> Part D of Lab 2. For each drill: the command(s) you ran, **one sentence in your own
> words** on what it did, and one on when you would reach for it again.
>
> Graded on the sentences, not the commands. Commands can be copied; understanding cannot.

## The three trees — in my own words

| Tree | What lives here |
|---|---|
| Working Directory | Local file directory |
| Staging Area (Index) | Where you go to commit files to whichever branch you are in. |
| HEAD | Current position in local branch |

---

## Drill 1 — Committed to `main` by accident

**Commands I ran:**
```bash
echo "oops" > accident.txt
git add accident.txt
git commit -m "feat: work that should have been on branch"

git switch -c fix/rescued-work
git switch main
git reset --hard origin/main

```
**What it did:**
Added a file and "accidentally" commited it to main then fixed the mistake.

**When I would use it again:**
When I accidentally add a file to my main branch.

---

## Drill 2 — Wrong commit message / forgot a file

**Commands I ran:**
```bash
echo "x" > note.txt
git add note.txt
git commit -m "asdf"

git commit --amend -m "docs: add note file"
```
**What it did:**
Added a note text file with a bad commit message, then fixed it.

**Why you must not do this to a commit you already pushed:**
Amending a commit that is already pushed rewrites history.

---

## Drill 3 — Committed a file that should be ignored

**Commands I ran:**
```bash
mkdir -p target
echo "junk" > target/Main.class
git add -f target/Main.class
git commit -m "chore: oops, committed build output"
```
**What it did:**
"Accidentally" added a file that should be ignored.

**Why adding it to `.gitignore` alone was not enough:**
we forced added it to the commit.

---

## Drill 4 — Merge conflict

**Commands I ran:**
```bash
git switch main
git switch -c feature/a
printf '# DungeonForge - branch A title\n' > README.md
git commit -am "docs: title from branch A"

git switch main
git switch -c feature/b
printf '# DungeonForge - branch B title\n' > README.md
git commit -am "docs: title from branch B"

git switch main
git merge feature/a
git merge feature/b
```
**In the conflict markers, which side was "mine"?**
My side was the branch A side.

**What it did:**
Changed the title from two different branches, causing a merge conflict.

**How I would back out of a merge I regretted starting:**
Checkout a previous commit and rebase.

---

## Drill 5 — "I destroyed everything"

**Commands I ran:**
```bash
git log --oneline
git reset --hard HEAD~3
git log --oneline

git reflog
git reset --hard <hash from before>
```
**What `git reflog` showed me:**
All previous commits including those nuked.

**One sentence on why this changes how nervous I should be about Git:**
Gives me a way to reinstate old files that were nuked.

---

## Stretch — Drill 6 (detached HEAD, interactive rebase)

**Notes:**

---

## The one command I want to remember from today
```bash
git reset --hard HEAD~[n]
```
