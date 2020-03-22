<template>
    <div>
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
        <category-product-drawer></category-product-drawer>
    </div>
</template>

<script>
    import HeadlineComp from "./HeadlineComp";
    import CategoryProductDrawer from "./CategoryProductDrawer";
    export default {
        name: "SearchProductComp",
        components: {HeadlineComp, CategoryProductDrawer},
        data: () => ({
            headlineTitle: "Das hier ist der Titel",
            headlineText: "Das ist dann der ganze TExt dazu"
        })
    }
</script>

<style scoped>

</style>