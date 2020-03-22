<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
        <v-form v-model="valid">
            <v-container>
                <v-row>
                    <v-col cols="4">Markt</v-col>
                    <v-col cols="5">Produkt</v-col>
                    <v-col cols="3">Verfügbarkeit</v-col>
                </v-row>
                <v-row>
                    <v-expansion-panels>
                        <v-expansion-panel>
                            <v-expansion-panel-header>
                                <v-row no-gutters>
                                    <v-col cols="4">Aldi</v-col>
                                    <v-col cols="5"></v-col>
                                    <v-col cols="3">
                                        <v-progress-linear
                                                background-color="warning"
                                                color="success"
                                                value="50"
                                                style="height: 100%"
                                        ></v-progress-linear>
                                    </v-col>
                                </v-row>
                            </v-expansion-panel-header>
                            <v-expansion-panel-content>
                                <v-row no-gutters>
                                    <v-col cols="4"></v-col>
                                    <v-col cols="5">Brot</v-col>
                                    <v-col cols="3">
                                        <v-icon color="success">mdi-food</v-icon>
                                    </v-col>
                                </v-row>
                                <v-row no-gutters>
                                    <v-col cols="4"></v-col>
                                    <v-col cols="5">Hefe</v-col>
                                    <v-col cols="3">
                                        <v-icon color="warning">mdi-food</v-icon>
                                    </v-col>
                                </v-row>
                                <v-row justify="center">
                                    <v-btn rounded color="primary">Anpsassen</v-btn>
                                </v-row>
                            </v-expansion-panel-content>
                        </v-expansion-panel>
                        <v-expansion-panel>
                            <v-expansion-panel-header>
                                <v-row no-gutters>
                                    <v-col cols="4">Norma</v-col>
                                    <v-col cols="5"></v-col>
                                    <v-col cols="3">
                                        <v-progress-linear
                                                color="warning"
                                                value="100"
                                                style="height: 100%"
                                        ></v-progress-linear>
                                    </v-col>
                                </v-row>
                            </v-expansion-panel-header>
                            <v-expansion-panel-content>
                                <v-row no-gutters>
                                    <v-col cols="4"></v-col>
                                    <v-col cols="5">Brot</v-col>
                                    <v-col cols="3">
                                        <v-icon color="warning">mdi-food</v-icon>
                                    </v-col>
                                </v-row>
                                <v-row no-gutters>
                                    <v-col cols="4"></v-col>
                                    <v-col cols="5">Hefe</v-col>
                                    <v-col cols="3">
                                        <v-icon color="warning">mdi-food</v-icon>
                                    </v-col>
                                </v-row>
                                <v-row justify="center">
                                    <v-btn rounded color="primary">Anpsassen</v-btn>
                                </v-row>
                            </v-expansion-panel-content>
                        </v-expansion-panel>
                        <v-expansion-panel>
                            <v-expansion-panel-header>
                                <v-row no-gutters>
                                    <v-col cols="4">Kaufland</v-col>
                                    <v-col cols="5"></v-col>
                                    <v-col cols="3">
                                        <v-progress-linear
                                                color="error"
                                                value="100"
                                                style="height: 100%"
                                        ></v-progress-linear>
                                    </v-col>
                                </v-row>
                            </v-expansion-panel-header>
                            <v-expansion-panel-content>
                                <v-row no-gutters>
                                    <v-col cols="4"></v-col>
                                    <v-col cols="5">Brot</v-col>
                                    <v-col cols="3">
                                        <v-icon color="error">mdi-food</v-icon>
                                    </v-col>
                                </v-row>
                                <v-row no-gutters>
                                    <v-col cols="4"></v-col>
                                    <v-col cols="5">Hefe</v-col>
                                    <v-col cols="3">
                                        <v-icon color="error">mdi-food</v-icon>
                                    </v-col>
                                </v-row>
                                <v-row justify="center">
                                    <v-btn rounded color="primary">Anpsassen</v-btn>
                                </v-row>
                            </v-expansion-panel-content>
                        </v-expansion-panel>
                    </v-expansion-panels>
                </v-row>
                <v-row justify="center" style="padding-top: 1em">
                    <v-btn rounded color="info" v-on:click="stepBack" x-large>Zurück</v-btn>
                </v-row>
            </v-container>
        </v-form>
    </div>
</template>

<script>
    import HeadlineComp from "./HeadlineComp";

    export default {
        name: "SearchResultComp",
        components: {HeadlineComp},
        data: () => ({
            headlineTitle: "Verfügbare Produkte",
            headlineText: "Wir empfehlen dir folgende Märkte, bitte wähle den Markt aus den Du besuchst."
        }),
        methods: {
            stepBack: function () {
                this.$emit('back');
            }
        },
    }
</script>

<style scoped>

</style>