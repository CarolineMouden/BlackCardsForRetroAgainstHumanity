# Black cards for Retro Against Humanity

This is a simple Android project to create Cards Against Humanity like black card for playing Retrospective Against Humanity

## What is Cards Against Humanity?

It's a dark humored card game that brings the worst of people. And that's what make it fun.
https://cardsagainsthumanity.com/

## What is Retro Against Humanity?

It's a retrospective that use the game concept of Cards Againts Humanity.
If you never header of retrospective or Agile before, [check this out](https://www.scrum.org/resources/what-is-a-sprint-retrospective) !

You can check out [this great blog for Box UK](https://www.boxuk.com/insight/retros-against-humanity/) where they give cards sample and their version of the rules.
I put the sentences part of their cards on the english version of this application.

## How I did play it in my team

* During his turn, the game master read the card and the other write theirs answers.
* Like the original game, the game master read all the sentences without knowing the authors.
* Everyone then dot-vote the answer that they feel correspond better to the sprint (1 point for the player, 2 points for the game master)
* We keep only the winner card (make sure to add the sentence on it)
* The game master change to the next player until everyone has played.

Then we can define actions from the kept cards.

## I want to adapt it to my needs

###### I want to add/remove cards
The cards are contained in ./app/src/main/res/values-<locale>/strings.xml, where locale is your language value (eg `en` for english, `fr` for french, `es` for spanish, ...)
You can find the items in : `<string-array name="cards_selection">`.

You can use _B_ as a shortcut for the blank part of your text.

###### My language is not present
You can just copy one of the values-<locale> with your own id and change the `cards_selection` item in `strings.xml`

## Licences

This projet is obviously under [Creative Commons](https://creativecommons.org/licenses/by-nc-sa/2.0/) license.
Have fun with it!