<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
    </div>
</template>

<script>
    export default {
        name: "SearchResultComp",
        data: () => ({
            headlineTitle: "Das hier ist der Titel",
            headlineText: "Das ist dann der ganze TExt dazu"
        })
    }
</script>

<style scoped>

</style>