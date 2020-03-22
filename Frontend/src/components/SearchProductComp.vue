<template>
    <div v-on:load="loadCategories">
        <headline-comp v-bind:title="headlineTitle" v-bind:text="headlineText"></headline-comp>
        <category-product-drawer v-bind:categories="categories" @forward="stepForward" @back="stepBack"></category-product-drawer>
    </div>
</template>

<script>
    import HeadlineComp from "./HeadlineComp";
    import CategoryProductDrawer from "./CategoryProductDrawer";
    import api from "../utils/backend-api"
    export default {
        name: "SearchProductComp",
        components: {HeadlineComp, CategoryProductDrawer},
        data: () => ({
            headlineTitle: "Produkte suchen",
            headlineText: "Bitte wähle die Produkte nach denen Du scuhen möchtest aus folgenden Kategorieen aus",
            categories: []
        }),
        methods: {
            loadCategories: function () {
                this.categories = api.getAllProducCategory();
                alert(this.categories);
            },
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