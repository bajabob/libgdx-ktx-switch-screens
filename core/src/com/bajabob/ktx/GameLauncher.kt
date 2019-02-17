package com.bajabob.ktx

import ktx.app.KtxGame
import ktx.app.KtxScreen

class GameLauncher : KtxGame<KtxScreen>() {

    override fun create() {
        super.create()

        addScreen(TitleScreen())
        setScreen<TitleScreen>()
    }

    override fun render() {
        super.render()
    }

    override fun dispose() {
        super.dispose()
    }
}
