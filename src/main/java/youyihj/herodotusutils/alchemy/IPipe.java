package youyihj.herodotusutils.alchemy;

import youyihj.herodotusutils.block.alchemy.TileAlchemyController;

import javax.annotation.Nullable;

/**
 * @author youyihj
 */
public interface IPipe {
    @Nullable
    TileAlchemyController getLinkedController();

    void setLinkedController(TileAlchemyController tileAlchemyController);

    default void unlinkController() {
        setLinkedController(null);
    }

    default void afterModuleMainWork() {
    }
}
