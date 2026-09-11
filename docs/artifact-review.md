# Artifact Review Clinic — Lab 2, Part C

> **This is the only document you write this week.** Everything else — the epics, the
> stories, the acceptance criteria, the Definition of Done, the sprint plans — was written
> for you.
>
> Reading critically is a harder and more useful skill than writing from a blank page, and it
> is the one that will make your own stories good when you start writing them in Week 6.

Read all three before answering:
- `docs/backlog.md`
- `docs/definition-of-done.md`
- `docs/sprint-01-plan.md`

---

## C1 — Find the three planted flaws · 12 pts

There is **exactly one deliberate defect in each of the three documents**: one bad user
story, one unverifiable Definition-of-Done criterion, and one sprint-plan item that isn't
what it claims to be.

> **Hint for the story:** re-read INVEST first. The bad one fails more than one letter.
>
> **Hint for the DoD:** ask of every checkbox — *could two reasonable people disagree about
> whether this is true?* If yes, it isn't a criterion. It's an opinion.

### Flaw 1 — in `docs/backlog.md`

**Which item:** 
User Story 1.4

**What's wrong with it:** 
It is not negotiable because it dictates what the developer needs to do, is subjective to the developer, and "More professional code" is not testable.

**Which INVEST letter(s) it violates, and how:** 
N, V, and T

**My repaired version:** 
I will pick a real beneficiary and define what "better code" is in measurable terms.

```
As a ...,
I want ...,
so that ...

Acceptance Criteria
- Given ..., when ..., then ...
- Given ..., when ..., then ...
```

---

### Flaw 2 — in `docs/definition-of-done.md`

**Which checkbox:** 
"The code is well written... checkbox..."

**Why it can't actually be checked:**
This is an opinion not an acceptance criteria.

**My replacement, phrased so that it can be:**
Every public class has a comment that states why it exists.

---

### Flaw 3 — in `docs/sprint-01-plan.md`

**Which item:** 
"I might get busy this week."

**Why it isn't really what the document calls it:** 
This risk can't be mitigated and is a forever risk.

**My repaired version, including a mitigation someone could actually act on:**
Monday through Wednesday are unavailable so all story points must be done by Saturday night at midnight.

---

## C2 — Say what's good, and why · 9 pts

Pick the **three strongest user stories** in `docs/backlog.md`. For each, two or three
sentences.

> Praise is harder than criticism, and it's where most of the learning is. "It's clear" earns
> nothing. "Its third criterion names an observable output — the same object reference — so
> two people would always agree whether it passed" earns full marks.

### Strong story 1: ______ US-1.1
As a game designer, I want every tunable number to live in one configuration file, so that I can rebalance the game without recompiling it.

**INVEST letters it satisfies especially well:**
I: one config file instead of multiple files means I don't need to recompile as often.
N: can negotiate how many numbers are tunable, cutting down on what is adjusted.
V: having one config file for these numbers keeps everything organized.
E: creating such a file shouldn't take more than a few hours.
T: will be able to test variables like max health or equipment loads.

**What specifically makes its acceptance criteria checkable:**
All four acceptance criteria are concrete and testable.

### Strong story 2: ______ US-1.2
As a developer, I want one seeded source of randomness, so that a bug someone reports can be reproduced exactly on my machine.

**INVEST letters it satisfies especially well:**
E: having one source of randomness can make it so bugs are reproducible, cutting down on fix time.
S: having one source of randomness is about as small as you can make for an iteration.
T: can replicate bugs more reliably and find what needs to be fixed.

**What specifically makes its acceptance criteria checkable:**
All acceptance criteria are testable.

### Strong story 3: ______ US-0.2
As a developer, I want continuous integration to fail loudly on a broken test, so that I can't merge work that doesn't run.

**INVEST letters it satisfies especially well:**
I: is an independent test that can be easily reversed.
V: is a valuable function in case of non-compilable code.
E: it is a quick check to see if it is working.
S: a single check to makes sure it'll catch bad compiles.
T: can test if code needs to be fixed.

**What specifically makes its acceptance criteria checkable:**
It is easily checked to see if it functions correctly.

---

## C3 — Trace a story to code · 4 pts

Take **US-1.1** (settings live in one place). **Write no Java.** In plain English, describe
what you'd expect to see in the pull-request diff when this story is done, and which
acceptance criterion each piece satisfies.

| What I'd expect in the diff | Which acceptance criterion it satisfies |
|---|---|
| config.json | AC1 |
| Config class | AC3 |
| GameWorld class | AC2 |
| Main class | AC1 |

**One sentence: how did the acceptance criteria help you predict the shape of the work?**
Acceptance criteria stated a need that dictated of a class or type.

---

## C4 — The bonus catch · up to +3 bonus

Once you have dealt with the bad story, something in `docs/sprint-01-plan.md` no longer adds
up the way it did.

**What is it:**

**What a real team would do about it in sprint planning:**

**What this suggests about the relationship between vague work and over-committed sprints:**

---

## C5 — One honest question

What is one thing about the Scrum process you still don't understand after this week? A good
question here is worth more to me than a confident wrong answer.

How would one be able to determine how long a Sprint should last? 

