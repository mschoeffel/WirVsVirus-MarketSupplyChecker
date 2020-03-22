<template>
    <div>
        <v-form v-model="valid" align-center>
            <v-container>
                <v-row class="text-center">
                    <v-col cols="6">
                        <v-expansion-panels>
                            <v-expansion-panel class="mx-auto"
                                               max-width="400"
                                               tile>
                                <v-expansion-panel-header>Bachwaren</v-expansion-panel-header>
                                <v-expansion-panel-content>
                                    <v-list flat>
                                        <v-list-item-group multiple>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Brot</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Brötchen</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Toast</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Hefe</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                        </v-list-item-group>
                                    </v-list>
                                </v-expansion-panel-content>
                            </v-expansion-panel>
                            <v-expansion-panel>
                                <v-expansion-panel-header>Fleischwaren</v-expansion-panel-header>
                                <v-expansion-panel-content>
                                    <v-list flat>
                                        <v-list-item-group multiple>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Hackfleisch</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Wurst</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                        </v-list-item-group>
                                    </v-list>
                                </v-expansion-panel-content>
                            </v-expansion-panel>
                            <v-expansion-panel>
                                <v-expansion-panel-header>Milchprodukte</v-expansion-panel-header>
                                <v-expansion-panel-content>
                                    <v-list flat>
                                        <v-list-item-group multiple>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Milch</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Planzliche Milch</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Joghurt</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Quark</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                        </v-list-item-group>
                                    </v-list>
                                </v-expansion-panel-content>
                            </v-expansion-panel>
                        </v-expansion-panels>
                    </v-col>
                    <v-col cols="6">
                        <v-expansion-panels>
                            <v-expansion-panel class="mx-auto"
                                               max-width="400"
                                               tile>
                                <v-expansion-panel-header>Obst</v-expansion-panel-header>
                                <v-expansion-panel-content>
                                    <v-list flat>
                                        <v-list-item-group multiple>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Apfel</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Birne</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Traube</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                        </v-list-item-group>
                                    </v-list>
                                </v-expansion-panel-content>
                            </v-expansion-panel>
                            <v-expansion-panel class="mx-auto"
                                               max-width="400"
                                               tile>
                                <v-expansion-panel-header>Gemüse</v-expansion-panel-header>
                                <v-expansion-panel-content>
                                    <v-list flat>
                                        <v-list-item-group multiple>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Karotten</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Gurken</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Paprika</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                        </v-list-item-group>
                                    </v-list>
                                </v-expansion-panel-content>
                            </v-expansion-panel>
                            <v-expansion-panel class="mx-auto"
                                               max-width="400"
                                               tile>
                                <v-expansion-panel-header>Getränke</v-expansion-panel-header>
                                <v-expansion-panel-content>
                                    <v-list flat>
                                        <v-list-item-group multiple>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Wasser</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Limo</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                            <v-list-item>
                                                <template>
                                                    <v-list-item-action>
                                                        <v-checkbox color="primary"></v-checkbox>
                                                    </v-list-item-action>
                                                    <v-list-item-content>
                                                        <v-list-item-title>Cola</v-list-item-title>
                                                    </v-list-item-content>
                                                </template>
                                            </v-list-item>
                                        </v-list-item-group>
                                    </v-list>
                                </v-expansion-panel-content>
                            </v-expansion-panel>
                        </v-expansion-panels>
                    </v-col>
                </v-row>
                <v-row justify="center">
                    <v-btn rounded color="info" v-on:click="stepBack" x-large>Zurück</v-btn>
                    <v-btn rounded color="primary" v-on:click="stepForward" x-large>Suchen</v-btn>
                </v-row>
            </v-container>
        </v-form>
    </div>
</template>

<script>
    export default {
        name: "CategoryProductDrawer",
        data: () => ({}),
        props: ["categories"],
        methods: {
            stepForward: function () {
                this.$emit('forward');
            },
            stepBack: function () {
                this.$emit('back');
            }
        },
    }
</script>

<style scoped>

</style>