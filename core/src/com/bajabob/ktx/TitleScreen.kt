package com.bajabob.ktx

import ktx.app.KtxScreen
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Label
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.utils.Align
import com.badlogic.gdx.utils.viewport.ScreenViewport



class TitleScreen: KtxScreen {

    val stage by lazy { Stage(ScreenViewport()) }

    override fun show() {
        super.show()

        val gameSkin = Skin(Gdx.files.internal("skin/glassy-ui.json"));

        val title = Label("Title Screen", gameSkin, "big-black")
        title.setAlignment(Align.center)
        title.setY(Gdx.graphics.height * 2 / 3f)
        title.setWidth(Gdx.graphics.width.toFloat())
        stage.addActor(title)

        Gdx.input.setInputProcessor(stage)
    }




    override fun render(delta: Float) {
        super.render(delta)
        Gdx.gl.glClearColor(0f, 0f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        stage.act()
        stage.draw()
    }
}