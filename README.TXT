# Robot Waiter

Robot Waiter is a small **Java console practice project** that simulates a “robot waiter” taking a group’s order details (party size + drinks) and generating an **itemized restaurant bill**.

It’s designed to practice core programming fundamentals—user input, variables/constants, conditionals, and basic arithmetic—using a real-world scenario (restaurant checkout).

---

## What it does

The program walks the user through a simple checkout flow:

- Prompts for:
  - number of adults
  - number of children under 12
  - number of teenagers (ages 12–18)
  - number of drinks
- Calculates itemized subtotals:
  - adults (fixed price)
  - teenagers (fixed price)
  - children under 12 (free)
  - drinks (fixed price)
- Applies an extra charge rule for large parties (automatic gratuity concept)
- Adds tax
- Optionally accepts a custom tip amount
- Prints a final receipt-style summary

---

## Pricing rules (as implemented)

- Adults: **$30.00** each  
- Teenagers (12–18): **$15.00** each  
- Children under 12: **free**  
- Drinks: **$2.99** each  
- Tax rate: **13%**  
- Automatic gratuity rule: **18%** (intended for groups of **20+ adults**)

---

## Project structure

- `robotWaiter.java` — main program logic (prompts, calculations, receipt output)
- `README.TXT` — placeholder README template (BlueJ-style)
- `package.bluej` / `robotWaiter.ctxt` — BlueJ project metadata
- `robotWaiter.class` — compiled output artifact

---

## How to run (intended environment)

This repository is structured as a **BlueJ** project, and the entry point is written in BlueJ style (a no-argument `main()` method). The easiest way to run it is to open the folder in BlueJ and run the `robotWaiter` class.

---

## Notes / known limitations

- **Tax vs. gratuity labeling:** the program uses a single variable for either “tax” or “automatic tip” depending on party size, and it prints it as “Tax” in the receipt output. In a production version, tax and gratuity would be calculated and displayed separately.
- **Input validation:** inputs assume valid integers and do not guard against negative numbers or accidental non-numeric values.
- **User input flexibility:** the “yes/no” tip prompt expects exact text and does not handle different casing (e.g., `Yes`, `YES`) or typos.
- **Formatting:** totals are printed as raw doubles; a polished version would format currency consistently to two decimals.

---

## Improvement ideas (if you want to level it up)

- Separate **tax** and **automatic gratuity** into two distinct calculations and receipt lines
- Add robust input validation (no negatives, retry on invalid input)
- Format money output with standard currency formatting (two decimal places)
- Support percent-based tips (e.g., 10%, 15%, 20%) in addition to flat dollar tips
- Convert the BlueJ-style entry point to a standard Java `main(String[] args)` for easier running outside BlueJ

---

