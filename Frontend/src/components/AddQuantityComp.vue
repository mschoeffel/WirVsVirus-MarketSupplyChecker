<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
    </div>
</template>

<script>
    import HeadlineComp from "./HeadlineComp";
    export default {
        name: "AddQuantityComp",
        components: {HeadlineComp},
        data: () => ({
            headlineTitle: "Das hier ist der Titel",
            headlineText: "Das ist dann der ganze TExt dazu"
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