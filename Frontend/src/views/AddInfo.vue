<template>
    <layout-default>
        <div class="home">
            <search-market-comp></search-market-comp>
            <search-product-comp></search-product-comp>
            <add-quantity-comp></add-quantity-comp>
            <add-result-comp></add-result-comp>
        </div>
    </layout-default>
</template>

<script>
    // @ is an alias to /src
    import LayoutDefault from "../layouts/LayoutDefault";
    import SearchMarketComp from "../components/SearchMarketComp";
    import SearchProductComp from "../components/SearchProductComp";
    import AddQuantityComp from "../components/AddQuantityComp";
    import AddResultComp from "../components/AddResultComp";

    export default {
        name: 'AddInfoMarket',
        components: {
            AddResultComp,
            AddQuantityComp,
            SearchProductComp,
            SearchMarketComp,
            LayoutDefault
        }
    }
</script>
