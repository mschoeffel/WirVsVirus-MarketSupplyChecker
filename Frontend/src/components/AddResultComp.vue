<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
    </div>
</template>

<script>
    export default {
        name: "AddResultComp",
        data: () => ({
            headlineTitle: "Das hier ist der Titel",
            headlineText: "Das ist dann der ganze TExt dazu"
        }),
        methods:{
            stepBack: function () {
                this.$emit('back');
            }
        }
    }
</script>

<style scoped>

</style>