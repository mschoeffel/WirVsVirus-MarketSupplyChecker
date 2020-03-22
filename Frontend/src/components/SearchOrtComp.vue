<template>
    <div>
        <headline-comp></headline-comp>
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
        components: {HeadlineComp}
    }
</script>

<style scoped>

</style>