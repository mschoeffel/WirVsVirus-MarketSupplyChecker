<template>
    <layout-default>
        <div class="home">
            <search-ort-comp></search-ort-comp>
            <search-product-comp></search-product-comp>
            <search-result-comp></search-result-comp>
        </div>
    </layout-default>
</template>

<script>
    // @ is an alias to /src
    import LayoutDefault from "../layouts/LayoutDefault";
    import SearchOrtComp from "../components/SearchOrtComp";
    import SearchProductComp from "../components/SearchProductComp";
    import SearchResultComp from "../components/SearchResultComp";

    export default {
        name: 'SearchOrt',
        components: {
            SearchResultComp,
            SearchProductComp,
            SearchOrtComp,
            LayoutDefault,
        }
    }
</script>
