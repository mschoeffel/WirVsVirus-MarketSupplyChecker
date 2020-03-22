<template>
    <div>
        <v-container>
            <v-row class="text-center">
                <v-col class="mb-4">
                    <h1 class="display-2 font-weight-bold mb-3">
                        {{title}}
                    </h1>

                    <p class="subheading font-weight-regular">
                        {{text}}
                    </p>
                </v-col>
            </v-row>
        </v-container>
    </div>
</template>

<script>
    export default {
        name: "HeadlineComp",
        props: ['title', 'text']
    }
</script>

<style scoped>

</style>