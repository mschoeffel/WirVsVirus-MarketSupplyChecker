<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
        <v-container>
            <v-row justify="center">
                <v-col cols="12" sm="6">
                    <v-text-field label="PLZ, Ort" outlined>
                    </v-text-field>
                </v-col>
                <v-col cols="12" sm="6">
                    <v-text-field label="Märkte" outlined>
                    </v-text-field>
                </v-col>
            </v-row>
        </v-container>
    </div>
</template>

<script>
    import HeadlineComp from "./HeadlineComp";
    export default {
        name: "SearchMarketComp",
        components: {HeadlineComp},
        data: () => ({
            headlineTitle: "Ort und Markt eingeben",
            headlineText: "Bitte trage eine PLZ und einen Ort ein. Wähle einen Markt aus und klicke dann auf \"Weiter\"."
        })
    }
</script>

<style scoped>

</style>