<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
        <v-form v-model="valid">
            <v-container>
                <v-row>
                    <v-text-field
                            label="Outlined"
                            outlined
                    ></v-text-field>
                </v-row>
                <v-row>
                    <v-btn color="primary">Primary</v-btn>
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
            headlineTitle: "Das hier ist der Titel",
            headlineText: "Das ist dann der ganze TExt dazu"
        })
    }
</script>

<style scoped>

</style>