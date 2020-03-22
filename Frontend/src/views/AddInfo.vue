<template>
    <layout-default>
        <div class="home">
            <search-market-comp v-if="step === 1" @forward="stepForward"></search-market-comp>
            <search-product-comp v-if="step === 2" @forward="stepForward" @back="stepBack"></search-product-comp>
            <add-quantity-comp v-if="step === 3" @forward="stepForward" @back="stepBack"></add-quantity-comp>
            <add-result-comp v-if="step === 4" @back="stepBack"></add-result-comp>
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
        },
        data: () => ({
            step: 1
        }),
        methods:{
            stepBack: function() {
                if (this.step !== 1) {
                    this.step = this.step -1;
                }
            },
            stepForward: function(){
                if (this.step !== 4){
                    this.step = this.step +1;
                }
            }
        }
    }
</script>
