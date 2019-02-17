package com.bajabob.ktx

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.scene2d.Scene2DSkin

class GameLauncher : KtxGame<KtxScreen>() {

    override fun create() {
        super.create()

        Scene2DSkin.defaultSkin = Skin(Gdx.files.internal("skin/glassy-ui.json"))

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
