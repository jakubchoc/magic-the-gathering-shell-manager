
### Magic Card Finder CLI Application
Welcome to the Magic Card Finder CLI Application! This application allows you to search for Magic: The Gathering cards and sets using simple commands in your command-line interface.

## How to Use
> Clone the Repository: Clone the Git repository to your local machine.

> Build the Application: Build the Spring Boot application using Maven or Gradle.

> Run the Application: Execute the JAR file to start the CLI application.

## Available Commands
**random:** Get a random Magic: The Gathering card.
> Usage: random
> 
**name:** Get a Magic: The Gathering card by exact name.
> Usage: name [card_name]

> Example: ***name "Lightning Bolt"***

**autocomplete:** Get autocomplete suggestions for Magic: The Gathering card names.
> Usage: autocomplete [search_word]

> Example: ***autocomplete "Light"***
After entering the search word, choose one of the suggested cards by entering its corresponding number.

**sets:** Get information about a specific Magic: The Gathering set by its code.

> Usage: sets [set code]

> Example: ***sets pip*** Than you can click and show one of cards.

**all sets:** Get information about all Magic: The Gathering sets.

> Usage: all sets [sort_by] [reverse_sort]

> Example: ***all sets name true***. Than you can chose one of set by entering set code. Will be open window with graphical view of card and than you can **click** and show one of them.

> Available sorting options: name, date, card_count, released_at. 


## API Source
The application uses the API provided by [Scryfall](https://scryfall.com/) to fetch Magic: The Gathering card data.
