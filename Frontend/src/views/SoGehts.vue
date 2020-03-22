<template>
    <layout-default>
        <div class="home">
            <HelloWorld/>
        </div>
    </layout-default>
</template>

<script>
    // @ is an alias to /src
    import HelloWorld from '@/components/HelloWorld.vue'
    import LayoutDefault from "../layouts/LayoutDefault";

    export default {
        name: 'SoGehts',
        components: {
            LayoutDefault,
            HelloWorld
        }
    }
</script>
