# Progress: What I've Learned

> Tracking what I actually know and can use confidently.
> Updated after each learning day.

---

## Day 1 — 29 April 2026 — Environment Setup

**What I learned:**
- macOS terminal basics (`cd`, `ls`, `pwd`, `mkdir`, `touch`)
- Homebrew package manager
- Python 3.12 installation via brew
- Git fundamentals — what is staging area, why we need `git add` before `git commit`
- Git config (user.name, user.email)
- GitHub account creation, professional username choice
- Personal Access Token for git authentication
- Repository cloning (`git clone`)
- First commit cycle: `git add` → `git commit` → `git push`
- Nano/pico editor basics (Ctrl+O save, Ctrl+X exit)
- macOS keychain credential helper

**Files created:**
- `journal.md` — learning diary
- `cheatsheet.md` — personal command reference

**Commits:** 5

---

## Day 2 — 30 April 2026 — Data Types & Functions

**What I learned:**

**Data types:**
- `int` (integers, unlimited size in Python)
- `float` (decimals, **not always exact** — `0.1 + 0.2 = 0.30000000000000004`)
- `str` (strings, single or double quotes)
- `bool` (True/False, capital letters required)
- `None` (special "nothing" value, has type NoneType)
- Type conversion: `int()`, `str()`, `float()`
- Type checking with `type()`

**Operators:**
- `/` regular division (returns float)
- `//` floor division (returns int, **rounds DOWN even for negatives** — `-10 // 3 = -4`)
- `%` modulo (remainder), useful for even/odd checks
- `**` power
- String operators: `+` concatenation, `*` repetition

**Variables:**
- Variables are names for values
- `age + 5` does NOT change `age` (immutable)
- `fruits.append(x)` DOES change the list (mutable)

**Lists:**
- `list[0]` first element, `list[-1]` last
- `list[index] = value` to replace
- `list[3]` out of range → `IndexError`

**Functions:**
- `def name(params): ...` syntax
- Parameters with default values: `def f(x=10):`
- Local vs global scope (variables inside vs outside function)
- `return` statement
- **Mutable default arguments trap** — `def f(items=[]):` shares list between calls
- Correct pattern: `def f(items=None): if items is None: items = []`

**Files created:**
- `day_2_journey.py` — first Python script

**Commits:** 2

---

## Day 3 — 1 May 2026 — Strings Deep

**What I learned:**

**String basics:**
- Single, double, triple quotes
- Escape characters: `\n` newline, `\t` tab
- `len(string)` — length

**Slicing:**
- `s[start:end]` — substring (end NOT included)
- `s[:n]` — from beginning to n
- `s[n:]` — from n to end
- `s[::-1]` — **reverse string** (very Pythonic!)
- `s[::2]` — every second character

**String methods:**
- `.upper()`, `.lower()`, `.title()` — case conversion
- `.strip()`, `.lstrip()`, `.rstrip()` — remove whitespace
- `.replace(old, new, count)` — substitution
- `.startswith()`, `.endswith()` — boolean check
- `.isalnum()` — only letters and digits?
- `.split(separator)` — string → list
- `.join(list)` — list → string
- `.count(substring)` — count occurrences
- **Strings are immutable** — methods return new string, original unchanged

**F-strings (modern formatting):**
- `f"Hello, {name}!"` — variable substitution
- `f"{age + 1}"` — expressions inside `{}`
- `f"{pi:.2f}"` — 2 decimal places
- `f"{percent:.0%}"` — percentage formatting
- Triple-quoted f-strings for multiline reports
- Ternary inside: `{"Pass" if score >= 60 else "Fail"}`

**Operators:**
- `in` operator — membership check (works for strings, lists)
- `not in` — opposite

**Practice tasks completed:**
1. ✅ `is_image(filename)` — file extension validator (`.endswith` with tuple)
2. ✅ `is_valid_email(email)` — full email validator with `isinstance`, `count`, `split`, `all`
3. ✅ `parse_user(csv_line)` — CSV parser → dict
4. ✅ `build_url(domain, *paths)` — URL builder with `*args` and `.join()`

**New concepts:**
- `*args` — variable number of positional arguments
- `isinstance(obj, type)` — type checking
- `all([conditions])` — True if all True
- Tuple unpacking: `name, domain = email.split("@")`
- Early return pattern (no `else` after `return`)
- DRY principle (Don't Repeat Yourself)

**Files created:**
- `day_3_f-strocks.py` — strings theory file
- `day_3_practice.py` — 4 functions

**Commits:** 3+

---

## Day 4 — 2 May 2026 — Lists, Loops, Comprehensions

**What I learned:**

**List methods:**
- `.append(x)` — add to end
- `.insert(i, x)` — insert at position
- `.remove(value)` — remove by value (first occurrence)
- `.pop()` / `.pop(i)` — remove and return last/at index
- `.sort()` — sort in place
- `.sort(reverse=True)` — descending
- `sorted(list)` — returns NEW sorted list (doesn't modify original)
- `del list[i]` — alternative remove by index

**For loops:**
- `for item in collection:` syntax
- Iteration over strings (each character)
- `range(N)` — 0 to N-1
- `range(start, end)` — start to end-1
- `range(start, end, step)` — with step
- Indentation matters (4 spaces inside loop body)

**Loop patterns (90% of real code):**
1. **enumerate** — index + value pairs: `for i, fruit in enumerate(fruits)`
2. **Accumulator** — `total = 0; for n in nums: total = total + n`
3. **Filter** — append to new list if condition
4. **Transform** — append modified value to new list

**While loops + flow control:**
- `while condition:` — repeat until false
- ⚠️ Must change condition inside or infinite loop!
- `break` — exit loop immediately
- `continue` — skip to next iteration

**List comprehensions (Pythonic magic):**
- `[expr for x in collection]` — transform
- `[expr for x in collection if condition]` — filter + transform
- One line replaces 3-4 lines of regular loop
- ⚠️ Don't overuse — readability > cleverness

**Built-in functions for collections:**
- `max(list, key=len)` — longest element
- `min(list, key=len)` — shortest
- `sum(list)` — total
- `round(number, digits)` — round to N decimals

**Dictionaries (started):**
- `{"key": value}` syntax
- Access via `dict["key"]`
- Add/update: `dict["new_key"] = value`
- `.get(key, default)` — get with fallback (no KeyError)
- Common pattern: counter via `dict[k] = dict.get(k, 0) + 1`

**Practice tasks completed:**
1. ✅ `analyze_words(words)` — word statistics dict
2. ✅ `count_letters(text)` — letter frequency counter

**Files created:**
- `day_4_lists_loops.py` — theory with sections
- `day_4_practice.py` — practice functions

**Commits:** 2+

---

## Course: System Administration (Master's, MIFI + SkillFactory) — Sep–Oct 2026 ✅ DONE

**Results:**
- HW1 (bash script + Git): **16/16**
- HW2 (container + RAID/LVM, service behind nginx with TLS): **18/18**
- Module 4 test: max score
- Capstone (repo + PDF report): submitted 22 Oct 2026, waiting for grade

**Project:** [`drodionichev/my-sysadmin-scripts`](https://github.com/drodionichev/my-sysadmin-scripts) — track "Base", cloud server Ubuntu 24.04.
Monitoring script (`free`, `df`, `uptime` every 30s → `monitor.log`) → packed into Docker → served behind nginx with HTTPS → run as a systemd service. Plus RAID 1 and LVM on loop devices.

**What I learned (hands-on, on a real server):**

**Linux & Bash:**
- Absolute vs relative paths, `~` vs `/`, `mkdir -p`, `rmdir`, `cp` with new name, `mv` trap (moving into an existing folder nests it), `ln -s`
- Bash: `while` + `sleep`, `if [ $? -gt 0 ]`, input validation, `which`, `touch`, redirects `2>/dev/null`
- `&` (run in background) vs `&&` (run next only if previous succeeded)
- `history | grep`, `tail -f`, `ss -tlnp` (who listens on which port), `uptime`

**Packages (apt):**
- `update` / `upgrade` / `install` / `remove` / `purge` / `autoremove`, `--simulate`
- Depends / Recommends / Suggests, repositories and GPG signatures

**Docker & Compose:**
- Image vs container, layers and build cache (`CACHED`)
- Dockerfile: `FROM`, `RUN`, `WORKDIR`, `COPY`, `CMD`
- `docker build / run / ps -a / stop / rm / rmi / logs / exec`, flags `-d`, `-p 127.0.0.1:8080:8080`, `--name`
- PID 1 ignores Ctrl+C / SIGTERM → `Exited (137)`
- After rebuild, the tag moves to the new image; a running container stays on the old one (shows image ID)
- Compose: services, build, ports, volumes, depends_on, healthcheck, restart policies

**Storage:**
- RAID 0 / 1 / 5 / 10, parity idea; `mdadm`, `/proc/mdstat`, `[2/2] [UU]` vs `[2/1] [_U]`
- LVM: PV → VG → LV, `lvextend -r` (grows ext4 online, no unmount)
- RAID 1 = reliability (costs half the space), LVM = flexibility — different tasks, not competitors
- ext4 takes space itself (journal, inodes, 5% root reserve) → `lvs` 400M vs `df` 359M
- Loop devices (`losetup`), `truncate` sparse files, `mkfs.ext4`, `mount`

**Networking & Web:**
- Ports, `127.0.0.1` (only this machine) vs `0.0.0.0` (all interfaces)
- DNS, HTTP request/response, status codes (301, 404, 502…)
- Reverse proxy: nginx as a shield, `proxy_pass`, `sites-available` / `sites-enabled`, `nginx -t` before `reload`
- TLS: certificate vs private key, CA / Let's Encrypt (needs a domain) vs self-signed (`openssl req -x509`), TLS termination, 301 redirect HTTP → HTTPS
- `curl -I / -k / -s`

**systemd & logs:**
- Unit file sections `[Unit]` / `[Service]` / `[Install]`, `After` / `Requires`, `Restart=on-failure`
- `daemon-reload`, `enable` (autostart on boot) vs `start` (now), `status`, `is-enabled`
- `docker start -a` — without `-a` the service "finishes" immediately
- `journalctl -u … -f / -n`, nginx `access.log` vs `error.log`
- Container sees requests from `172.17.0.1` (host in docker network), real client IP is only in `access.log`

**Bonus topics seen (not practiced yet):** WAF (ModSecurity + OWASP CRS), eBPF, OpenTelemetry, GPU / MIG / Kubernetes.

**Lessons about myself:**
- Doing things with my hands is easier than explaining them in writing — writing the report was the hardest part, and it still worked out.
- When I'm tired, simple wording falls apart. That's fatigue, not stupidity → take a break.
- Goal clarified: **SDET who is into DevOps**.

**Next:**
- Java course: "Calculator" and "Weather service" projects, deadline **16 Nov 2026**
- Later, for fun: WAF in Docker in front of my app, eBPF / bpftrace

---

## Java Day 1 — 23 October 2026 — Conditions

**Setup:**
- IntelliJ IDEA + JDK 21 + Maven project (`pom.xml`, `src/main/java/org/example/`)
- `target/` = Maven build output, never edit or commit it
- Java file name = class name, in `PascalCase` (`ConditionsPractice.java`); rename classes via Refactor → Rename (`Shift+F6`)
- Every class needs `package org.example;` matching its folder
- Program entry point: `public static void main(String[] args)`, run with ▶️
- `Cmd + Option + L` — auto-format code

**What I learned:**

**if / else if / else:**
- Condition always in `( )`, body in `{ }` — always use braces, even for one line
- `elif` in Python = `else if` in Java
- First matching branch wins, the rest are skipped
- Ladder order: **from the narrowest case to the widest** (FizzBuzz check first)
- Reject invalid input first (`score < 0 || score > 100`)

**Comparison & boundaries:**
- `>` vs `>=` — "60+" means 60 is included → `>=`
- Test boundary values: 17/18, 59/60, 89/90, -1/101 (boundary value analysis from manual QA works here too)

**Logical operators:**
- `&&` = and, `||` = or, `!` = not, `^` = XOR (exactly one, not both)
- Don't use `^` when you mean `||` — it may work by accident but misleads readers

**Strings:**
- ⚠️ Compare strings with `.equals()`, NOT `==` (`==` compares objects in memory)
- `.equals()` is case-sensitive: `"Admin"` ≠ `"admin"`

**Types:**
- `int / int` → `int` (fraction silently cut: `7 / 2 = 3`) → use `double` for calculator
- `char` for one symbol, single quotes: `'+'`; `String` uses double quotes: `"+"`
- Type is written only once, when the variable is declared (`int score = 60;`, later just `score`)
- `result()` with parentheses = method call, not a variable
- ⚠️ Local variable must be initialized before reading → `java: variable might not have been initialized`
- `double / 0` doesn't crash in Java — returns `Infinity` → check divisor before dividing

**switch (classic):**
- Answers only "is it EQUAL to…?" — no ranges (`> 90` → use `if`)
- `case` = input value, not the output
- `break` exits the switch; without it → **fall-through** into the next case (saw it live with `default`)
- Intentional fall-through to group cases (`case 3: case 2:`)
- `default` = final `else`
- Arrow switch (`case '+' -> ...`) exists — no `break`, no fall-through (to study later)

**Ternary:** `condition ? ifTrue : ifFalse` — Python's `a if cond else b` in another order

**Patterns:**
- `boolean` flag: `boolean isOk = true;` → set `false` only in error branches → `if (isOk)` print result
- `if (isOk)` instead of `if (isOk == true)`
- `=` assigns, `==` compares

**Practice tasks completed (`ConditionsPractice.java`):**
1. ✅ Age check — if/else
2. ✅ Grade letter — else if ladder + invalid input + `>=` boundaries
3. ✅ FizzBuzz — `&&` + branch order
4. ✅ Login — `.equals()` + `&&`
5. ✅ Mini calculator — classic switch, division by zero, `boolean` flag (core of the course "Calculator" project)

**Git & repo:**
- Removed empty `.git` that IDEA created inside the Java project (no nested repos)
- Moved Java project into the learning repo as `java/`
- Repo reorganized: `python/`, `java/`, `bash/`, `.md` files in root; used `git mv` to keep history
- GitHub repo renamed to `learning-journey-1`
- `.gitignore`: added `.idea/`; `echo >>` glued it to the last line (`.DS_Store.idea/`) → always check with `tail`
- Always `git status` before commit; never `git add .` while `VPN` / `passport.txt` sit in the repo folder (TODO: move them out or ignore)
- Claude can now commit to this repo via the GitHub App → always `git pull` before starting work

**Decision:** learning practice → `learning-journey-1` repo; course projects (Calculator, Weather) → separate repos.

---

## Java Day 2 — 24 October 2026 — Ternary Operator

**What I learned:**
- Ternary = `condition ? ifTrue : ifFalse` — read as "condition? if yes … otherwise …"
- ⚠️ Ternary is a **value**, not a command → branches hold values (`"Adult"`), NOT `System.out.println(...)` (println returns nothing)
- Use it to assign (`String status = age >= 18 ? "Adult" : "Minor";`) or right inside `println(...)`
- A `boolean` variable is already a condition: `even ? ... : ...` (same as `if (isOk)`)
- `:` is one colon; `::` is a different thing (later)
- Redundant patterns collapse: `cond ? true : false` and `if (cond) x = true; else x = false;` → `x = cond;`
- `"true"` in quotes is a `String`, not a `boolean`; type `boolean` is lowercase
- Course quiz: lost a point on `=` vs `==` (misclick, knew the answer) → in look-alike options, scan for `=` / `==` first

**Practice:** `status` with ternary ✅, even/odd inside `println` ✅

---

## Java Day 3 — 26 October 2026 — Loops

**IDEA fixes after moving the project:**
- `Module JDK is not defined` → `Cmd + ;` → SDK 21, Modules → Module SDK = Project SDK
- Orange cup ☕ icons = IDEA doesn't see the files as project sources → open the `java` folder (with `pom.xml`) as the project; blue `C` = OK
- File name must equal class name (`LoopsPractice.java` → `class LoopsPractice`), otherwise nested "matryoshka" + duplicate class
- `reached end of file while parsing` = a `}` is missing
- `Cmd + /` — comment/uncomment selected lines

**What I learned:**
- Iteration = one pass of the loop
- `i++` = `i = i + 1`; `i--`; `sum += i`
- `while (cond) { ... }` — checks BEFORE each pass; forget the step → infinite loop (stop with ⏹ in Run)
- `for (start; condition; step)` — order: start → check → body → **step** → check … (step runs AFTER the body, so `i = 0` prints 0 first)
- **Off-by-one**: `i = 0; i <= 10` = 11 numbers; check first and last iteration (boundary values again)
- Counting down: `for (int i = 10; i > 0; i--)`
- Loop variable `i` lives only inside its `for`; a variable declared in `main` lives in the whole `main`
- **Accumulator** pattern: create `sum = 0` BEFORE the loop, add inside, print AFTER
- `break` = leave the loop; `continue` = skip to the next pass
- Code after `break` in the same block → `unreachable statement`
- **Search pattern**: `while (true) { if (found) { print; break; } i++; }` — step at the END of the body, outside the `if`
- `do { ... } while (cond);` — runs at least once (input validation), `;` required
- Nested loops: inner loop runs fully for each outer pass; work multiplies
- Naming: `i/j/k` only for short `for` counters, otherwise meaningful names (`countdown`); `camelCase` vars, `PascalCase` classes

**Practice (`LoopsPractice.java`):**
1. ✅ 1→10 and 10→1 with `for` (fixed off-by-one)
2. ✅ Sum 1..100 = 5050 (accumulator)
3. ✅ Countdown with `while` + "Liftoff!"
4. ✅ FizzBuzz 1..30 (condition inside loop)
5. ✅ First number > 100 divisible by 7 and 13 → 182 (`while (true)` + `break`)
6. ⏳ do-while + Scanner validator (1..5) — **next session**
7. ⏳ Nested loops: star staircase — **next session**

---

## Confidence Self-Check

> Updated honestly. Goal: see real progress, not delusion.

| Topic | Confidence | Notes |
|---|---|---|
| Terminal navigation | 🟢 High | Used daily |
| Git basic flow | 🟢 High | add/commit/push automatic |
| Python types | 🟢 High | Day 2 solid |
| String methods | 🟡 Medium | Need more practice |
| F-strings | 🟢 High | Easy to use |
| Lists & methods | 🟡 Medium | Methods take a moment |
| For loops | 🟡 Medium | Just learned today |
| List comprehensions | 🟡 Medium | Get the pattern |
| Dictionaries | 🔴 Low | Just started |
| Functions writing | 🟡 Medium | Can write, sometimes need to think |
| Debugging | 🔴 Low | Read errors but slow |
| English (technical) | 🟡 Medium | Comments okay, conversation harder |
| Linux / Bash | 🟢 High | Lived on a real server for weeks |
| Docker / Compose | 🟢 High | Built, ran, debugged my own images |
| RAID / LVM | 🟡 Medium | Built and extended; theory solid, little real-disk practice |
| nginx / TLS | 🟡 Medium | Set up reverse proxy + HTTPS myself |
| systemd / logs | 🟡 Medium | Wrote a unit, read journalctl and access.log |
| Explaining in writing | 🟡 Medium | Capstone report done, still slow |
| Java if / else / logic ops | 🟢 High | Mapped from Python easily, boundaries clicked |
| Java switch | 🟡 Medium | Classic + fall-through understood; arrow switch not practiced |
| Java types & variables | 🟡 Medium | Init rule and `.equals()` new, needs repetition |
| Java ternary | 🟡 Medium | Clicked after "it's a value, not a command" |
| Java for / while | 🟡 Medium | Solved 5 tasks; step placement and off-by-one still need attention |
| Java do-while / nested loops | 🔴 Low | Theory only, practice next |

---

## Tools & Setup

**Installed:**
- macOS Sonoma+
- Homebrew
- Python 3.12.13
- Git 2.50+
- PyCharm Professional
- IntelliJ IDEA + JDK 21 + Maven
- GitHub account: `drodionichev`
- Cloud server (Ubuntu 24.04) with Docker, nginx, mdadm, lvm2

**Project structure:**
```
~/Projects/python-learning-journey/   (GitHub: drodionichev/learning-journey-1)
├── .gitignore
├── README.md
├── journal.md
├── cheatsheet.md
├── progress.md        (this file)
├── python/            all day_*.py, my_tools.py, data.json
├── java/              Maven project (IntelliJ), src/main/java/org/example/
└── bash/              analyze_log.sh
```

---

*Last updated: 26 October 2026*
