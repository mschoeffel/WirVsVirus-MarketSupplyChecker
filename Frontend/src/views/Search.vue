<template>
    <layout-default>
        <div class="home">
            <search-ort-comp v-if="step === 1" @forward="stepForward"></search-ort-comp>
            <search-product-comp v-if="step === 2"></search-product-comp>
            <search-result-comp v-if="step === 3"></search-result-comp>
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
                if (this.step !== 3){
                    this.step = this.step +1;
                }
            }
        }
    }
</script>
