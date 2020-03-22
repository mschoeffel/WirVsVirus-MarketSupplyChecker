<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
        <v-form v-model="valid" justify="center">
            <v-container>
                <v-row>
                    <v-col cols="4"></v-col>
                    <v-col cols="4">Nudeln</v-col>
                    <v-col cols="4"></v-col>
                    </v-row>
                <v-row justify="center">
                    <v-radio-group v-model="row" row>
                        <v-radio label="keine Angabe" value="radio-1" color="info"></v-radio>
                        <v-radio label="leer" value="radio-2" color="error"></v-radio>
                        <v-radio label="geringer Bestand" value="radio-3" color="warning"></v-radio>
                        <v-radio label="mittlerer Bestand" value="radio-4" color="accent"></v-radio>
                        <v-radio label="hoher Bestand" value="radio-5" color="success"></v-radio>
                    </v-radio-group>
                </v-row>
                <v-row justify="center">
                    <v-btn rounded color="info" v-on:click="stepBack" x-large>Zurück</v-btn>
                    <v-btn rounded color="secondary" v-on:click="stepForward" x-large>Weiter</v-btn>
                </v-row>
            </v-container>
        </v-form>
    </div>
</template>

<script>
    import HeadlineComp from "./HeadlineComp";
    export default {
        name: "AddQuantityComp",
        components: {HeadlineComp},
        data: () => ({
            headlineTitle: "Verfügbarkeit",
            headlineText: "Bitte wähle die entsprechende Verfügbarkeit des Produkts."
        }),
        methods:{
            stepForward: function () {
                this.$emit('forward');
            },
            stepBack: function () {
                this.$emit('back');
            }
        }
    }
</script>

<style scoped>

</style>