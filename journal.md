# My Python Learning Journey

## Goal
Become an SDET in 18-24 months

## Background
- Currently a Manual QA
- Learning Python and Java in parallel
- Starting from scratch in programming

## Day 1 — 29 April 2026
- Installed Python 3.12 via Homebrew
- Set up Git and GitHub account (drodionichev)
- Created first repository: python-learning-journey
- First steps with terminal, nano/pico editor, git config
- Tomorrow: Python data types and mutable default arguments trap

## Day 1 Reflection
- Made first git push by myself, without instructions
- Started feeling less afraid of terminal
- Lesson: I remember more than I think

## Day 2 30 April 2026
- Learned basic data types
- Understood the difference between mutable and immutable
- Practiced using the .append method
- Completed a logic challenge on mutability

## Day 3 — 1 May 2026 — Strings Deep

**What I learned:**
- String slicing: s[start:end], s[::-1] (reverse), s[::2]
- String methods: .upper(), .lower(), .strip(), .replace(), .split(), .join(), .count(), .startswith(), .endswith(), .isalnum()
- Strings are immutable — methods return new string
- F-strings: variable substitution, expressions, formatting (:.2f, :.0%)
- *args — variable number of positional arguments
- isinstance(), all(), tuple unpacking
- Early return pattern, DRY principle

**Practice tasks:**
- is_image(filename) — file extension validator
- is_valid_email(email) — email validator
- parse_user(csv_line) — CSV parser to dict
- build_url(domain, *paths) — URL builder

**Files created:** day_3_f-strocks.py, day_3_practice.py
**Commits:** 3+

## Day 4 — 2 May 2026 — Lists, Loops, Comprehensions

**What I learned:**
- List methods: .append(), .insert(), .remove(), .pop(), .sort(), sorted()
- For loops, range(), enumerate()
- Loop patterns: accumulator, filter, transform
- While loops, break, continue
- List comprehensions
- Built-ins: max(), min(), sum(), round()
- Dict basics: .get(key, default), counter pattern

**Practice tasks:**
- analyze_words(words) — word statistics
- count_letters(text) — letter frequency counter

**Files created:** day_4_lists_loops.py, day_4_practice.py
**Commits:** 2+

## Day 6 — 31 May 2026 — Dictionaries Deep

**What I learned:**
- Dict iteration: .items(), .keys(), .values()
- .update() — add/update multiple keys at once
- .pop(key) — remove and return value
- Nested dicts — accessing data with double []
- Nested loops — outer loop over users, inner over skills
- .join() inside f-strings
- Counter pattern applied to nested data structures

**Practice tasks:**
- get_skill_summary(users) — nested dict + join
- count_skills(users) — nested loop + counter pattern
- merge_users(users1, users2) — merging dicts with .update()

**Files created:** day_6_dicts.py
**Commits:** 1

## Day 7 — 1 June 2026 — Tuples & Sets

**What I learned:**

**Tuples:**
- Immutable — can't change after creation (TypeError on assignment)
- Indexing works like lists: point[0]
- Can be used as dict keys (lists can't)
- Tuple unpacking: low, high = get_min_max(nums)
- Functions return multiple values as a tuple

**Sets:**
- Collection of unique elements, unordered
- Auto-removes duplicates: set([1,2,2,3]) → {1,2,3}
- {} is an empty dict, set() is an empty set
- Set operations:
  - & intersection (in both)
  - | union (all together)
  - - difference (in a but not b)
- .add() — add element (like .append() for sets)

**Practice tasks:**
- find_duplicates(items) — counter pattern + set for unique result
- compare_api_response(expected, actual) — set difference both ways (real QA pattern)

**Files created:** day_7_tuples_sets.py
**Commits:** 1

## Day 8 — 2 June 2026 — Conditions & Functions Deep

**What I learned:**

**Conditions:**
- if / elif / else — checks top to bottom, first True wins, rest skipped
- Order matters — from specific to general (wrong order breaks logic)
- Logical operators: and (both True), or (at least one), not (inverts)
- Chained comparison: 90 <= score <= 100 (pythonic, cleaner than two ands)

**Functions deep:**
- *args — any number of positional arguments, collected into a TUPLE
- **kwargs — any number of named arguments, collected into a DICT
- The = sign at call time decides: no name → args, name=value → kwargs
- Parameter order is strict: normal params, then *args, then **kwargs

**New bits:**
- any(condition for x in collection) — True if at least one is True (brother of all())
- char.isdigit() — check if a character is a digit

**Practice tasks:**
- can_vote(age, is_citizen) — and logic, early return
- grade_score(score) — if/elif chain with range checks + Invalid guard
- build_test_report(suite, *results, **meta) — real test-report structure
- check_passwords(*passwords) — *args + dict result + compound condition + any()

**Files created:** day_8_conditions.py
**Commits:** 1

## Day 9 — Files & JSON

**What I learned:**

**Files (with open):**
- with open(...) as f: — auto-closes the file even on error (why it's the standard)
- Write mode: open("file", "w"), f.write() — "w" overwrites, "a" appends
- Three ways to read:
  - f.read() — whole file as one string
  - f.readlines() — list of lines
  - for line in f: — line by line (most common), + .strip()

**JSON:**
- import json — built-in module, no install needed
- json.dump(data, f, indent=2) — write dict to JSON file
- json.load(f) — read JSON file back into a dict
- dump/load work with FILES; dumps/loads (with s) work with STRINGS
- Connection to API: response comes as string → json.loads(response) → dict

**Practice tasks:**
- count_lines(filename) — count lines in a file
- save_results(filename, results) — save list of test results to JSON
- count_words(text) — word frequency counter using .get(word, 0) + 1 (built solo)

**Files created:** day_9_files.py, stack_learning.py, test.txt, data.json, results.json
**Commits:** 1

**Note:** count_passed() left unfinished — to be completed later.

## Day 10 — Error Handling (try/except)

**What I learned:**
- try/except — catch errors so program doesn't crash
- Error types: ValueError, KeyError, IndexError, TypeError, ZeroDivisionError, FileNotFoundError
- except ... as e — capture and log the error object
- Multiple except blocks — different reaction per error
- except (A, B) — one reaction for several errors (DRY)
- else (runs on success) / finally (runs always, for cleanup)
- Key lesson: catch the SPECIFIC error that actually occurs (int("abc")→ValueError, lst["a"]→TypeError, lst[99]→IndexError)
- Reminder: a function must RETURN its result, not just print it

**Practice tasks:**
- parse_user — protected int() (ValueError + IndexError)
- safe_divide — ZeroDivisionError, return None on failure
- get_element — IndexError vs TypeError, return messages
- read_config — FileNotFoundError + file reading (links to Day 9)

**Files created:** day_10_errors.py (adjust)
**Commits:** 1

## Day 11 — 8 August 2026 — Modules & Imports

**What I learned:**

**Import styles:**
- import math — take whole module, call via math.sqrt()
- from math import sqrt — take one name, call directly sqrt()
- import math as m — rename on import
- from module import * — DON'T use, pollutes namespace

**Own modules:**
- A module = just a .py file
- import my_tools — pulls in your own file from the same folder
- Module name = filename without .py
- Import runs the whole file top to bottom

**if __name__ == "__main__":**
- Every module has a hidden __name__ variable
- Run file directly → __name__ == "__main__"
- Import file elsewhere → __name__ == "module_name"
- Code under this block runs ONLY on direct run, not on import
- Used for entry point / self-tests that shouldn't fire when imported

**Packages:**
- Package = a folder with modules
- __init__.py marks the folder as a package (can be empty)
- Import with dots: from utils.string_tools import shout

**Stdlib modules for SDET:**
- datetime — datetime.now(), .year, .hour (timestamps, test timing)
- json — dumps (dict→string), loads (string→dict); dump/load = files
- os — os.getcwd(), os.path.exists("file") (paths, env vars)

**Practice:**
- Played with math / random (randint includes both bounds!)
- Built my_tools.py + imported it two ways
- Saw __name__ behave differently on direct run vs import
- Created first package: utils/ with __init__.py + string_tools.py
- Used datetime / json / os hands-on

**Files created:** day_11.py, my_tools.py, utils/ (__init__.py, string_tools.py)
**Commits:** 1

**Note:** progress.md dropped — journal.md is now the single progress tracker.

## Day 12 — 11 August 2026 — Functions Deep: Closures

**What I learned:**

**Functions are objects (first-class):**
- A function is a value — store in a variable (no parens!), pass, return it
- greet = function object; greet() = calling it
- Pass a function into another: apply(func, value) → func(value)

**Scope — LEGB rule:**
- Local → Enclosing → Global → Built-in, searched in that order, stops at first match
- Reading an outer variable: fine
- Assigning to it inside a function → Python treats it as LOCAL → UnboundLocalError
- global keyword fixes it BUT is bad practice — prefer take-argument / return-value

**Closures:**
- Inner function returned from outer, "remembers" outer's variables
- 3 conditions: nested function + uses enclosing var + outer returns inner (no parens)
- make_multiplier(2) → factory bakes factor=2 into the returned function
- Arg at creation → goes to outer; arg at call → goes to inner
- Foundation for decorators

**Functional tools:**
- sorted(collection, key=len) — key is a function, called per element
- map(func, coll) / filter(func, coll) — return lazy objects, wrap in list()
- lambda x: x * 2 — anonymous one-line function, auto-returns

**Practice:**
- double / apply_twice — passing functions around
- test_scope / broken — caught UnboundLocalError live
- make_adder(n) — built a working closure factory
- sorted by len, map→squares, filter→>2 with lambdas

**Files created:** day_12_functions.py
**Commits:** 1