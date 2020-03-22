<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
        <v-form v-model="valid" justify="center">
            <v-container>
                <v-row justify="center">
                    <v-col cols="4"></v-col>
                    <v-col cols="4"><v-text-field label="Ort/PLZ" outlined></v-text-field></v-col>
                    <v-col cols="4"></v-col>
                </v-row>
                <v-row justify="center">
                    <v-btn rounded color="primary" v-on:click="stepForward" x-large>Weiter</v-btn>
                </v-row>
            </v-container>
        </v-form>
    </div>
</template>

<script>
    import HeadlineComp from "./HeadlineComp";
    export default {
        name: "SearchOrtComp",
        components: {HeadlineComp},
        data: () => ({
            headlineTitle: "Ort eingeben",
            headlineText: "Bitte gebe einen Ort/PLZ ein an dem Du dann nach verfügbaren Produkten suchen möchtest. Klicke dann auf Weiter"
        }),
        methods:{
            stepForward: function () {
                this.$emit('forward');
            }
        }
    }
</script>

<style scoped>

</style>