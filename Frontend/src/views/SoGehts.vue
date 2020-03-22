<template>
    <layout-default>
        <div class="sogehts">
            <SoGehtsComp/>
        </div>
    </layout-default>
</template>

<script>
    // @ is an alias to /src
import LayoutDefault from "../layouts/LayoutDefault";
import SoGehtsComp from '../components/SoGehtsComp';

    export default {
        name: 'SoGehts',
        components: {
            LayoutDefault,
            SoGehtsComp
        }
    }
</script>
