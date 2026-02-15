# Card Deck Simulator (SimpleCardDeck)

CardDeckSimulator is a small **Java console app** (built as a **BlueJ project**) that demonstrates the core behavior of a “deck” using a simple **Last-In–First-Out** model: you can **put** a card onto the deck, **take** a card off the deck, and **print** the current contents.

It’s essentially a beginner-friendly practice project for working with:
- arrays and fixed-size storage
- user input via `Scanner`
- loops and conditional logic
- simple state management (tracking the current deck size)

---

## What this project does

The program maintains an in-memory “deck” with a maximum capacity of **52 cards**. Cards are stored as plain text values (strings), so you can type any label you want (e.g., `AS`, `10H`, `Queen of Spades`, etc.).

From the menu you can:

- **Put (`p`)**: add a card to the top of the deck (if there is space)
- **Take (`t`)**: remove the last card that was added and print it (if the deck is not empty)
- **Print (`r`)**: display the current deck contents in order
- **Quit (`q`)**: exit the program

---

## How the “deck” is modeled

- The deck is stored in a fixed `String[52]` array.
- A `deckSize` counter tracks how many cards are currently in the deck.
- Adding a card stores it at index `deckSize` then increments `deckSize`.
- Taking a card removes the item at index `deckSize - 1` then decrements `deckSize`.

This makes the behavior consistent and predictable, and it mirrors how a **stack** data structure works.

---

## How to run it

This repository includes BlueJ project files (`package.bluej`, `.ctxt`), and the main entry point is written in a BlueJ-friendly style.

Typical usage:
- Open the project folder in **BlueJ**
- Run the `SimpleCardDeck` class
- Follow the on-screen menu prompts to enter commands (`p`, `t`, `r`, `q`)

---

## Included files

- `SimpleCardDeck.java` — main program logic (menu + deck operations)
- `README.TXT` — placeholder template file
- `package.bluej` and `*.ctxt` — BlueJ project metadata
- `SimpleCardDeck.class` — compiled output (generated artifact)

---

## Limitations (current behavior)

- **No validation** of card input (the program accepts any text as a “card”).
- The “deck” behaves like a **stack** (LIFO). It does not simulate realistic deck operations like shuffling, drawing from the top, dealing hands, or preventing duplicates.
- The entry-point method is designed for BlueJ; running it in a standard Java environment may require adjusting the program entry method to the conventional Java signature.

---

## Roadmap ideas (easy upgrades)

If you want to expand this into a more realistic deck simulator:

- Add a real 52-card generator (suits + ranks)
- Add `shuffle`, `draw`, `dealHand(n)`, and `resetDeck` actions
- Validate inputs and prevent duplicates
- Replace the raw array with a `List` or a dedicated `Deck` class (cleaner design)
- Add unit tests for push/pop/empty/full edge cases

---

## License

No license file is currently included. If you plan to share or accept contributions, add a standard license (MIT / Apache-2.0) to make usage terms explicit.
