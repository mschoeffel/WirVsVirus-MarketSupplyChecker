<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
        <v-container>
            <v-row justify="center">
                <v-btn rounded color="primary" dark x-large>Produkt<br>suchen</v-btn>
                <v-btn rounded color="success" dark x-large>Produkt<br>Eintragen</v-btn>
            </v-row>
        </v-container>
    </div>
</template>

<script>
import HeadlineComp from "./HeadlineComp";
  export default {
    name: 'SoGehtsComp',
    components: {HeadlineComp},
    data: () => ({
        headlineTitle: "So geht's",
        headlineText: "WarenRadar ermöglicht die Auswahl verschiedener Waren an einem bestimmten Ort / Postleitzahl und zeigt dem Nutzer an, " +
                      "in welchem Supermarkt alle oder die Meisten der Waren vorhanden sind. " +
                      "Da wir beim Erfassen von Beständen auf Eure Mithilfe angewiesen bitten wir Euch die Bestände regelmäßig zu aktualisieren. " +
                      "Entweder durch Abfrage nach dem Einkauf oder durch die aktive Erfassung, wenn Ihr ohnehin im Supermarkt seid. " +
                      "Über den Klick auf „Produkt Suche” gelangst du zur Auswahl der Stadt, hier kannst Du entweder nach Ort oder einer genauen Postleitzahl suchen. " +
                      "Anschließend wählst Du aus den verschiedenen Kategorien die Waren aus die Du kaufen möchtest. " +
                      "Als Ergebnis erhältst Du den Supermarkt der alle oder die meisten deiner Waren noch im Angebot hat. " +
                      "Durch klicken auf „Produkt Eintragen” gelangst Du ebenfalls zur Auswahl der Stadt, " + 
                      "hier kannst Du entweder nach Ort oder einer genauen Postleitzahl suchen. " +
                      "Anschließend wählst Du den Supermarkt aus für den Du Bestände pflegen möchtest. " +
                      "Auf der nächsten Seite kannst Du die Produkte wählen für die Du die Verfügbarkeit eintragen willst. " +
                      "Du gibst die Bestände an und bestätigst mit „Weiter”."
    })
  }
</script>
