<template>
    <v-expansion-panels>
        <v-expansion-panel>
            <v-expansion-panel-header>Category</v-expansion-panel-header>
            <v-expansion-panel-content>
                <v-card class="mx-auto"
                        max-width="400"
                        tile>
                    <v-list flat>
                        <v-list-item-group v-model="products" multiple>
                            <v-list-item>
                                <template v-slot:default="{ active, toggle }">
                                    <v-list-item-action>
                                        <v-checkbox
                                                v-model="active"
                                                color="primary"
                                                @click="toggle"
                                        ></v-checkbox>
                                    </v-list-item-action>

                                    <v-list-item-content>
                                        <v-list-item-title>Product</v-list-item-title>
                                    </v-list-item-content>
                                </template>
                            </v-list-item>
                        </v-list-item-group>
                    </v-list>
                </v-card>
            </v-expansion-panel-content>
        </v-expansion-panel>
    </v-expansion-panels>
</template>

<script>
    export default {
        name: "CategoryProductDrawer",
        data: () => ({
            products: {}
    }),
    }
</script>

<style scoped>

</style>